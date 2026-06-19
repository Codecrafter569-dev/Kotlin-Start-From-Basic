import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

fun main(): Unit = runBlocking{
  println("===== Part A : coroutine (normal) ======")
  
  try {
    coroutineScope{
      launch{
        try {
          repeat(10){
            delay(300.milliseconds)
            println("Regular  scope ==== Worker A tick $it")
          }
        } catch (e: CancellationException) {
          //e.printStackTrace()
          println("Regular scope ---- Worker A was canceled....")
          throw e
        }
      }
      
      launch{
        
      }
    }
  } catch (e: Exception) {
    //e.printStackTrace()
    
    println("Regular scope caught: ${e.message}\n")
    }
  
  
  delay(500.milliseconds)
  
  
  println("Part B ==  supervisorScope =====")
  
  supervisorScope{
    launch{
      try {
        repeat(10){ 
          delay(300.milliseconds)
          println("Supervisor scope — Worker A tick $it")
        }
      } catch (e: CancellationException) {
        //e.printStackTrace()
        println("Supervisor scope — Worker A was cancelled! (should not happen)")
                throw e
      }
    }
    launch{
      delay(700.milliseconds)
      
      throw RuntimeException("Supervisor scope — Worker B failed!")
    }
    
  }
  println("Done !!!.....")
}