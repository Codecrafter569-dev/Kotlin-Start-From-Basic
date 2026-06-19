inline fun <reified T> demonstrate(value : Any){
  println("Is T? ${value is T}")
  
  val casted = value as? T
  println("Cast result : $casted")
  
  println("Claaa : ${T::class.simpleName}")
  
  println("IsA check: ${isA<T>(value)}")
}
inline fun <reified T> isA(value :Any) = value is T
fun main(){
  demonstrate<String>("Hello")
  
  demonstrate<Int>("Hello")
}