import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking{
  println("The main Thread was started...")
  
  
  val job = launch{
    println("The work is started in background...")
    delay(200.milliseconds)
    println("background work was done...")
  }
  
  println("Main was do won work.. ")
  job.join()
  
  println("Ab sab katam hua hai ...")
}