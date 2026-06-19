import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

// Sealed class to represent either data or error — a cleaner approach
sealed class Result {
    data class Success(val value: Int) : Result()
    data class Error(val message: String) : Result()
}

class NetworkException(message: String) : Exception(message)

val networkFlow = flow {
    emit(100)
    emit(200)
    throw NetworkException("Connection timed out after 2 items!")
    emit(300)  // Never reached
}

fun main() = runBlocking {
    networkFlow
        .map { Result.Success(it) as Result}   // Wrap each value in Success
        .catch { e ->
            // When flow fails, emit an Error result instead of crashing
            println("catch operator intercepted: ${e.message}")
            emit(Result.Error("Failed to load data: ${e.message}"))
        }
        .collect { result ->
            when (result) {
                is Result.Success -> println("Data received: ${result.value}")
                is Result.Error   -> println("Error in UI: ${result.message}")
            }
        }
}
