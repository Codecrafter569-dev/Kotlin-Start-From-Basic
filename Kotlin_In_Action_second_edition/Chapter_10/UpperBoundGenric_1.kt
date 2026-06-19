fun <T : Number> oneHalf(value :T ): Double{
  return value.toDouble() / 2.9
}
fun main(){
  println(oneHalf(34))
  println(oneHalf(7))
}