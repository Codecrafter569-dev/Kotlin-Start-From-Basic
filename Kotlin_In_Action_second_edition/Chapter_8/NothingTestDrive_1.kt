fun fail(message: String) : Nothing{
  throw IllegalStateException(message)
}
fun main(){
  val value: String? = null
  
  val result : String  = value ?: fail("Value must not be null")
  println(result)
}