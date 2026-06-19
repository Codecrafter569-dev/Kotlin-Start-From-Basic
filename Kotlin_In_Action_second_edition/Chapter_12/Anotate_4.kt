@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class JsonName(val name: String)

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class JsonExclude
data class Person(@JsonName("alias") val firstName : String, @JsonExclude val age : Int? = null)
fun main(){
  val person = Person("Alice",29)
  println(person)
}