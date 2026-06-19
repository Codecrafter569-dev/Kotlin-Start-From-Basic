inline fun <reified T> isA(value: Any): Boolean = value is T
fun main(){
  println(isA<String>("abcdef"))
  println(isA<String>(123456))
  println(isA<Int>(29))
  println(isA<Double>(93))
  println(isA<Int>("Vikash"))
  println(isA<Double>(39.93))
}