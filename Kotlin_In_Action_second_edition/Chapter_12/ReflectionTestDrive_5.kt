import kotlin.reflect.full.*
import kotlin.reflect.KClass

fun serializerValue(value: Any?): String = when(value){
  null -> "null"
  is String  -> "\"$value\""
  is Number,
  Boolean  -> value.toString()
  is List<*>  -> value.joinToString(prefix = "[",postfix  = "]"){
    serializerValue(it)
  }
  
  else  -> serializeAny(value)
}

private fun StringBuilder.serializeObject(obj: Any){
  val kClass = obj::class as KClass<Any>
  kClass.memberProperties.joinTo(this,prefix ="{",postfix ="}" ){
    prop ->
    "\"${prop.name} \" : ${ serializerValue(prop.get(obj))}"
    
  }
}

fun serializeAny(obj: Any): String = buildString{
  serializeObject(obj) 
}

data class Address(val city: String,val coountry: String)
data class Employee(val name: String,val age: Int,val address: Address)
fun main(){
  val emp = Employee(
  name = "Bob",
  age = 45,
  address = Address("Jharkhand","India")
  )
  println(serializeAny(emp))
}