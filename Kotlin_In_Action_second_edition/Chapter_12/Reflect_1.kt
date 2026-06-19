import kotlin.reflect.full.*
class Person(val name: String,val age: Int)
fun main(){
  val person = Person("Vikash",89)
  val kClass = person::class
  
  println("Simple Name : ${kClass.simpleName}")
  
  println("Qualified Name : ${kClass.qualifiedName}")
  
  println("Properties :")
  kClass.memberProperties.forEach{ println("  -${it.name} : ${it.returnType} ") }
}