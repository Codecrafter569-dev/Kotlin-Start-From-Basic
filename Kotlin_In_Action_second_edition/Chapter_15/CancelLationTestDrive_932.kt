import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds
fun main() = runBlocking{
  val job = launch{
    repeat(10){ i -> println("The work was doing ... : $i")
    delay(300.milliseconds)
    }
    
  }
  
  delay(800.milliseconds)
  println("The cancelion process was started ....")
  
  job.cancelAndJoin()
  println("coroutines cancelion ho gaya , ab aage badhta hain ...")
  
}