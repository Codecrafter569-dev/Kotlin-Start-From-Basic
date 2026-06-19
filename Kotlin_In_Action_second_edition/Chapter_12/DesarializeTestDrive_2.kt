import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor

data class Person(val name: String,val age : Int)

fun <T: Any> simpleDeserialze(
jsonMap: Map<String,Any?>,
targetClass : KClass<T>
): T {
  val consts = targetClass.primaryConstructor  ?: error("No primary constructor found")
  
  val args = consts.parameters.associateWith{ param ->  jsonMap[param.name]
  }
  return consts.callBy(args)
}
fun main(){
  val jsonMap = mapOf("name" to "Vikash","age" to 25)
  
  val person = simpleDeserialze(jsonMap,Person::class)
  
  println(person)
  println(person.name)
  println(person.age)
}