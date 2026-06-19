import kotlinx.coroutines.*

suspend fun calculateScore(): Int{
  delay(300)
  return 97
}
suspend fun calculateBouns(): Int{
  delay(300)
  return 30
}
fun main()= runBlocking{
  println("Calculating.....")
  
  val scoreDeferred = async{ calculateScore()}
  val boundDeferred = async{ calculateBouns()}
  
  val score = scoreDeferred.await()
  val bouns = boundDeferred.await()
  
  println("Score : $score , Bouns : $bouns")
  println("Total : ${score+bouns}")
}