@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class JsonExclude

data class Person(@JsonExclude val age : Int? = null)
fun main(){
  println(Person(null))
}