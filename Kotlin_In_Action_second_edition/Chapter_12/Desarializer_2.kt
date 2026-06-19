import kotlin.reflect.full.*
import kotlin.reflect.KClass

data class ValidationError(val missingFields: List<String>)

sealed class DeserializeResult<T> {
    data class Success<T>(val value: T) : DeserializeResult<T>()
    data class Failure<T>(val error: ValidationError) : DeserializeResult<T>()
}

fun <T : Any> safeDeserialize(
    kClass: KClass<T>,
    data: Map<String, Any?>
): DeserializeResult<T> {
    val constructor = kClass.primaryConstructor
        ?: return DeserializeResult.Failure(ValidationError(listOf("No constructor")))

    // Find required (non-optional, non-nullable) params that are missing
    val missing = constructor.parameters
        .filter { !it.isOptional && !it.type.isMarkedNullable }
        .filter { it.name !in data }
        .map { it.name ?: "unknown" }

    if (missing.isNotEmpty()) {
        return DeserializeResult.Failure(ValidationError(missing))
    }

    val args = constructor.parameters
        .filter { it.name in data }
        .associateWith { data[it.name] }

    return DeserializeResult.Success(constructor.callBy(args))
}

data class LoginRequest(val username: String, val password: String, val rememberMe: Boolean = false)

fun main() {
    val good = mapOf("username" to "vikash", "password" to "kotlin123")
    val bad  = mapOf("username" to "vikash")  // missing password

    when (val result = safeDeserialize(LoginRequest::class, good)) {
        is DeserializeResult.Success -> println("OK: ${result.value}")
        is DeserializeResult.Failure -> println("Error: ${result.error}")
    }

    when (val result = safeDeserialize(LoginRequest::class, bad)) {
        is DeserializeResult.Success -> println("OK: ${result.value}")
        is DeserializeResult.Failure -> println("Missing fields: ${result.error.missingFields}")
    }
}
