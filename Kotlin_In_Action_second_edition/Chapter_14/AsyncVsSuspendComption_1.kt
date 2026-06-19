import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

suspend fun fetchScore(): Int{
  delay(300.milliseconds)
  return 100
}
suspend fun fetchBouns(): Int{
  delay(300.milliseconds)
  return 100
}
fun main() = runBlocking{
  val start1 = System.currentTimeMillis()
  val score1 = fetchScore()
  val bonus1 = fetchBouns()
  
  println("Sequential : ${System.currentTimeMillis() - start1}ms ,  Total = ${score1+bonus1}")
  
  
  val start2 = System.currentTimeMillis()
  val scoreDeferred = async{ fetchScore()}
  val bounsDeferred = async{ fetchBouns() }
  
  val score2 = scoreDeferred.await()
  val bonus2 = bounsDeferred.await()
  
  println(" Async : ${System.currentTimeMillis() - start2}ms , Total = ${score2 + bonus2}")
}