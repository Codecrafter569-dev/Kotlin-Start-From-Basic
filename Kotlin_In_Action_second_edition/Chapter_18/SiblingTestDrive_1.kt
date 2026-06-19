import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds
fun main(): Unit = runBlocking{
  
  
  println("Parant coroutine started....")
  
  launch{
    try {
      repeat(10){ i -> 
      println("Hearbeat $i")
      delay(300.milliseconds)
      }
    } catch (e: Exception) {
     // e.printStackTrace()
     
     println("Hearbeat was cancelled : ${e::class.simpleName}")
    }
  }
  
  launch{
    delay(1.seconds)
    
    println("Child 2 is about to throw an Exception ....")
    throw UnsupportedOperationException("Child 2 failed!")
  }
  
  println("Both children launch , Parant is waiting....")
}