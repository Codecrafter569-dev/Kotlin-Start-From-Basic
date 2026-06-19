import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

fun main(): Unit = runBlocking{
  println("Starting with supervisorScope.....")
  
  supervisorScope{
    launch{
      try {
        repeat(8){ i ->
        println("Heartbeat $i --- running normally...")
        delay(400.milliseconds)
        }
      } catch (e: Exception) {
       // e.printStackTrace()
       
       println("Heartbeat terminated : ${e::class.simpleName}")
       throw e
      }
    }
    
    launch{
      delay(1.seconds)
      
      println("Failing coroutines : About to throw !!")
      
      throw UnsupportedOperationException("I failed, but I won't take down my siblings!")
    }
  }
  
  println("supervisorScope block completed....")
}