import kotlin.reflect.KClass
interface Company{
  val name: String
}
data class CompanyImpl(override val name: String): Company

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class DeserializeInterface(val imple : KClass<out Company>)
data class Person(
val name: String,
@DeserializeInterface(CompanyImpl::class) val company : Company
)
fun main(){
  val p = Person("Alice",CompanyImpl("OpenAi"))
  println(p)
}