import kotlin.reflect.typeOf

val typeRegistry = mutableMapOf<String,Any>()
inline fun <reified T> register(value : T){
  val typeName = T::class.simpleName ?: "Unknown"
  typeRegistry[typeName]  = value as Any
  println("Registered ${typeName} : $value")
}
inline fun <reified T> retrieve() : T? {
  val typeName = T::class.simpleName ?: return null
  val value = typeRegistry[typeName]
  return if(value is T) value else null
}
fun main(){
  register<String>("Hello kotlin")
  register<Int>(485)
  register<Double>(45.90)
  register<String>("Vikash Kumar")
  
  println(retrieve<String>())
  println(retrieve<Int>())
  println(retrieve<Double>())
  println(retrieve<Int>())
  println(retrieve<Long>())
  println(retrieve<String>())
}