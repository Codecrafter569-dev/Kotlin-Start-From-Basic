import kotlin.reflect.full.*
import kotlin.reflect.KClass

interface ValueSerializer<T>{
  fun toJsonValue(value: T): Any?
}

fun serialixerPropertyValue(value: Any?): String = when(value){
  null -> "null"
  is String -> "\"$value\""
  is Number,
  is Boolean  -> value.toString()
  else      -> "\"$value\""
}

fun serializerString(s: String) = "\"$s\""

private fun StringBuilder.serializerObject(obj: Any){
  val kClass = obj::class as KClass<Any>
  val properties = kClass.memberProperties
  
  properties.joinTo(this,prefix="{",postfix="}"){
    prop ->
    val name = serializerString(prop.name)
    val value = serialixerPropertyValue(prop.get(obj))
    "$name : $value"
  }
}



fun serializer(obj : Any): String = buildString{
  serializerObject(obj)}
  
  data class Person(val name: String,val age:Int)
  data class Point(val x:Double,val y:Double)
fun main(){
  val person = Person("Vikash",30)
  println(serializer(person))
  
  val point = Point(3.93,9.39)
  println(serializer(point))
}