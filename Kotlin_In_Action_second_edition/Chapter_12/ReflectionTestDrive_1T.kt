import kotlin.reflect.full.*
import kotlin.reflect.KClass
import kotlin.reflect.KProperty1

// --- Annotation Declarations ---
annotation class JsonExclude                      // marks properties to skip
annotation class JsonName(val name: String)       // renames property in JSON

// --- Serialization helpers ---
fun toJsonVal(value: Any?): String = when (value) {
    null       -> "null"
    is String  -> "\"$value\""
    is Number,
    is Boolean -> value.toString()
    else       -> "\"$value\""
}

// Serializes one property (respects @JsonName)
private fun StringBuilder.serializeProperty(
    prop: KProperty1<Any, *>, obj: Any
) {
    // If @JsonName exists, use its name argument; otherwise use prop.name
    val jsonNameAnn = prop.findAnnotation<JsonName>()
    val propName = jsonNameAnn?.name ?: prop.name

    append("\"$propName\": ${toJsonVal(prop.get(obj))}")
}

// Serializes whole object (respects @JsonExclude)
private fun StringBuilder.serializeObject(obj: Any) {
    (obj::class as KClass<Any>)
        .memberProperties
        .filter { it.findAnnotation<JsonExclude>() == null } // skip excluded props
        .joinTo(this, prefix = "{", postfix = "}") { prop ->
            buildString { serializeProperty(prop, obj) }
        }
}

fun serialize(obj: Any): String = buildString { serializeObject(obj) }

// --- Test ---
data class Person(
    @JsonName("alias") val firstName: String,   // renamed in JSON
    val age: Int,
    @JsonExclude val password: String            // excluded from JSON
)

fun main() {
    val p = Person("Alice", 29, "secret123")
    println(serialize(p))
    // {"alias": "Alice", "age": 29}
    // Notice: firstName became "alias", password is gone
}
