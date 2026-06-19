import kotlin.reflect.KClass

class TypeBox<T>(
  val value: T,
  val type : KClass<*>
  ){
    fun describe() = "Box <${type.simpleName}>: $value"
  }
inline fun <reified T> boxOf(value : T): TypeBox<T>{
  return TypeBox(value , T::class)
}
fun main(){
  val intBox = boxOf(393)
  val strBox = boxOf("Kotlin No Bro how i can help you ...")
  
  println(intBox.describe())
  println(strBox.describe())
}