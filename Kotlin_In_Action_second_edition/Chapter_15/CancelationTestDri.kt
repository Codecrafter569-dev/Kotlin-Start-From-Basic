import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

fun main()  = runBlocking{
  val job = launch{
    
    println("A")
    delay(500.milliseconds)
    
    println("B")
    println("C")
  }
  
  delay(200.milliseconds)
  job.cancel()
  println("Cancel was called on this time ....")
  job.join()
  println("Job confirm Cancel huaaa ....")
}