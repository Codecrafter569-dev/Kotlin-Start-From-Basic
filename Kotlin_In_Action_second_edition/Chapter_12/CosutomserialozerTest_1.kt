import kotlin.reflect.full.*
import kotlin.reflect.KProperty
import kotlin.reflect.KClass
import java.text.SimpleDateFormat
import java.util.Date

// --- Infrastructure ---

interface ValueSerializer<T> {
    fun toJsonValue(value: T): Any?
}

@Target(AnnotationTarget.PROPERTY)
annotation class CustomSerializer(
    val serializerClass: KClass<out ValueSerializer<*>>
)

// Extension on KProperty: extracts the custom serializer if annotated
fun KProperty<*>.getSerializer(): ValueSerializer<Any?>? {
    val ann = findAnnotation<CustomSerializer>() ?: return null
    val serializerClass = ann.serializerClass

    // objectInstance = non-null if it's an `object` (singleton)
    // createInstance() = creates a new instance if it's a `class`
    val instance = serializerClass.objectInstance
        ?: serializerClass.createInstance()

    @Suppress("UNCHECKED_CAST")
    return instance as ValueSerializer<Any?>
}

// --- Custom Serializer: formats Date as readable string ---
object DateSerializer : ValueSerializer<Date> {
    private val fmt = SimpleDateFormat("yyyy-MM-dd")
    override fun toJsonValue(value: Date): String = fmt.format(value)
}

// --- Serialization logic ---
fun toJsonVal(value: Any?): String = when (value) {
    null       -> "null"
    is String  -> "\"$value\""
    is Number,
    is Boolean -> value.toString()
    else       -> "\"$value\""
}

fun serializeProp(prop: kotlin.reflect.KProperty1<Any, *>, obj: Any): String {
    val rawValue  = prop.get(obj)
    // Use custom serializer if present; otherwise use raw value
    val jsonValue = prop.getSerializer()?.toJsonValue(rawValue) ?: rawValue
    return "\"${prop.name}\": ${toJsonVal(jsonValue)}"
}

fun serialize(obj: Any): String {
    val kClass = obj::class as KClass<Any>
    return kClass.memberProperties.joinToString(prefix = "{", postfix = "}") {
        serializeProp(it, obj)
    }
}

// --- Test ---
data class Person(
    val name: String,
    @CustomSerializer(DateSerializer::class) val birthDate: Date
)

fun main() {
    val person = Person("Alice", SimpleDateFormat("yyyy-MM-dd").parse("1995-06-15")!!)
    println(serialize(person))
    // {"birthDate": "1995-06-15", "name": "Alice"}
}
