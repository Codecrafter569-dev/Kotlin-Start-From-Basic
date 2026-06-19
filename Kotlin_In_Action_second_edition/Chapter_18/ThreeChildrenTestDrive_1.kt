import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds
fun main(): Unit = runBlocking{
  //launch{
//    
//  }
  
//  launch{
    
//  }

try {
  coroutineScope{
    launch{
      try {
        println("Worker A : Starting long task....")
        delay(5.seconds)
        println("Worker A : Done!!")
      } catch (e: CancellationException) {
      println("Worker A : Got CancellationException before finised...")
      throw e
       // e.printStackTrace()
      }
    }
    launch{
      try {
        println("Worker B : Starting medium task...")
        delay(3.seconds)
        println("Worker B : Done!!")
      } catch (e: CancellationException) {
      //  e.printStackTrace()
      println("Worker B : Got CancellationException before finised...")
      throw e
      }
    }
    
    launch{
      println("Worker C : Starting....")
      delay(1.seconds)
      println("workers C : Something went wrong throwing ...")
      
      throw IllegalStateException("Worker C encountered a critical error!")
    }
  }
} catch (e: IllegalStateException) {
  //e.printStackTrace()
  println("\n Caught in main : ${e.message}")
  println("All workers were stopped becase of Worker C's failure....")
}
}