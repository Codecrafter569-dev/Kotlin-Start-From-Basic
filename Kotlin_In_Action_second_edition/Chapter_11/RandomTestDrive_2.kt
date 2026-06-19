import kotlin.random.Random
fun main(){
  val list: MutableList<Any?> = mutableListOf('a',1,"Vikash")
  val chars = mutableListOf('a','b','c')
  
  
  val unnownElements : MutableList<*> = if(Random.nextBoolean()) list else chars
  
  println(unnownElements.first())
  println(unnownElements)
  println(list)
  println(chars)
}