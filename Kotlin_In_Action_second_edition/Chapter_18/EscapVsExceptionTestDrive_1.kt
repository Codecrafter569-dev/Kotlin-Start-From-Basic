import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds
suspend fun riskyOperation(name : String , handleInternally: Boolean){
  delay(800.milliseconds)
  if (handleInternally) {
  try {
    throw RuntimeException("$name: internal error")
  } catch (e: RuntimeException) {
    //e.printStackTrace()
    println("$name : Handled internally ==== ${e.message}")
  }
    
  } else {
    throw RuntimeException("$name : Unhandled eror!!")
  }
  
}
fun main(): Unit = runBlocking{
  println("==== Scenario A : Exception contains internally =====")
  
  try {
    coroutineScope{
      launch{
        riskyOperation("Worker -1",handleInternally = true)
      }
      launch{
        repeat(5){
          delay(400.milliseconds)
          println("Sibling hearbeat tirck $it")
        }
      }
    }
  } catch (e: Exception) {
   // e.printStackTrace()
   println("Outer catch (A): ${e.message}")
  }
  
  println("\n === Scenario B : Exception ecapes coroutine =====")
  try {
    coroutineScope{
      launch{
        riskyOperation("Worker -2 ",handleInternally = false)
      }
      launch{
        repeat(5){
          delay(400.milliseconds)
          println("Sibling Heartbeat tick $it")
        }
      }
    }
  } catch (e: Exception) {
   // e.printStackTrace()
   
   println("Outer catch (B): Heartbeat was cancelled because Worker-2 failed: ${e.message}")
  }
  
  
}