import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

fun main(){
  println("Main thread was started : ${Thread.currentThread().name}")
  
  runBlocking{
    println("Coroutines was go in inside...")
    delay(300.milliseconds)
    println("Coroutines was come form inside ...")
  }
  
  println("Main Thread was now back....")
}