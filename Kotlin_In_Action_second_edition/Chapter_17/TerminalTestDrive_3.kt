import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
fun main(): Unit = runBlocking{
  val scores = flowOf(900,34,60,56,88,122)
  
  val topScores = scores.first()
  println("First score : $topScores")
  
  val emptyResult = emptyFlow<Int>().firstOrNull()
  
  println("From empty  flow : $emptyResult")
}