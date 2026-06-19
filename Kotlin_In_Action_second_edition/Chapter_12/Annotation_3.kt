import kotlin.reflect.KClass
import java.util.Date

interface ValueSerializer<T>{
  fun toJsonValue(value: T): Any?
  fun fromjsonValue(jsonValue: Any?): T
}
class DataSerializer :ValueSerializer<Date>{
  override fun toJsonValue(value : Date): Any? = value.time
  override fun fromjsonValue(jsonValue: Any?) : Date = Date(jsonValue as Long)
}

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class CustomerSerializer(
val serializerClass : KClass<out ValueSerializer<*>>
)
data class Person(
val name: String,
@CustomerSerializer(DataSerializer::class) val birthDate: Date
)
fun main(){
  val p = Person("Vikssh",Date())
  println(p)
}