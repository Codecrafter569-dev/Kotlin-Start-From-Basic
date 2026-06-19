import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds
fun main():Unit = runBlocking{
  launch{
    try {
      repeat(8){ i ->
      println("HeartBeat #$i -- still alive...")
      delay(400.milliseconds)
      }
    } catch (e: CancellationException) {
     // e.printStackTrace()
     println("HeartBeat terminated unexpectedly : $e")
     throw e
    }
  }
  
  launch{
    try {
      delay(1.seconds)
      println("Child 2 : About to throw....")
      throw UnsupportedOperationException("Ow! Something broke in Child 2")
    } catch (u: UnsupportedOperationException) {
     // e.printStackTrace()
     
     println("Child 2 : Caught my own exception : ${u.message}")
     println("Child 2 : Recovering gracefully , no siblings harmed ...")
    }
  }
  
  delay(3.5.seconds)
  println("Main finished --- HeartBeat ran the whole times !...")
}