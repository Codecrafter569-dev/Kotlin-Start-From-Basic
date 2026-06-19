import kotlin.reflect.full.*
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1

annotation class JsonExclude
annotation class JsonName(val name: String)

fun toJson(value: Any?): String = when (value) {
    null       -> "null"
    is String  -> "\"$value\""
    is Number,
    is Boolean -> value.toString()
    else       -> "\"$value\""
}

private fun StringBuilder.serializeProperty(prop: KProperty1<Any, *>, obj: Any) {
    val name = prop.findAnnotation<JsonName>()?.name ?: prop.name
    append("\"$name\": ${toJson(prop.get(obj))}")
}

private fun StringBuilder.serializeObject(obj: Any) {
    (obj::class as KClass<Any>)
        .memberProperties
        .filter { it.findAnnotation<JsonExclude>() == null }
        .joinTo(this, prefix = "{", postfix = "}") {
            buildString { serializeProperty(it, obj) }
        }
}

fun serialize(obj: Any) = buildString { serializeObject(obj) }

// A more complex real-world-like class
data class UserProfile(
    @JsonName("user_id")   val id: Int,
    @JsonName("full_name") val name: String,
    val email: String,
    @JsonExclude           val internalToken: String,
    @JsonExclude           val createdAt: String,
    @JsonName("active")    val isActive: Boolean
)

fun main() {
    val user = UserProfile(
        id            = 42,
        name          = "Vikash Kumar",
        email         = "vikash@example.com",
        internalToken = "tok_abc123",
        createdAt     = "2024-01-01",
        isActive      = true
    )

    println(serialize(user))
}
