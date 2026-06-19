import kotlin.random.Random
fun main(){
  val list = mutableListOf<Any?>('a',1,"qwe","Hello")
  val chars = mutableListOf('a','b','c')
  
  val unknownElements : MutableList<*>  = if(Random.nextBoolean()) list else chars
  
  val first : Any? = unknownElements.first()
  println("First element : $first")
}