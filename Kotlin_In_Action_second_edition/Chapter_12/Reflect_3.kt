import kotlin.reflect.full.*
import kotlin.reflect.KClass

data class Employee(
  val name: String,
  val age: Int,
  val salary : Double,
  val department : String,
  val isRemote : Boolean
)

fun countPropertiesOfType(obj: Any,targetType : KClass<*>): Int{
  return obj::class.memberProperties.count{it.returnType.classifier == targetType }
}
fun main(){
  val emp = Employee("Vikash",78,889990.0,"Engineeering",true)
  
  val stringCount = countPropertiesOfType(emp,String::class)
  
  val intCount = countPropertiesOfType(emp,Int::class)
  val boolCount = countPropertiesOfType(emp, Boolean::class)
  
  println("String properties : $stringCount")
  println("Integer properties : $intCount")
  println("boolCount properties : $boolCount")
}