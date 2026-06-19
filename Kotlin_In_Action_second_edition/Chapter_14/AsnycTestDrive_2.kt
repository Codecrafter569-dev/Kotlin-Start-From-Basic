import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

private var zeroTime = System.currentTimeMillis()
fun log(message: Any?) =
    println("${System.currentTimeMillis() - zeroTime}ms " +
            "[${Thread.currentThread().name}] $message")


suspend fun slowlyAddNumbers(a : Int,b : Int): Int{
  log("Waiting a bit before calculating $a + $b ")
  delay(100.milliseconds * a)
  return a + b
}
fun main() = runBlocking{
  log("Starting the Asnyc computions")
  
  val myFirstDeferred = async{ slowlyAddNumbers(2,2)}
  val mySecondDeffered = async{ slowlyAddNumbers(4,4)}
  
  log("Waiting for deferred value to be available ..")
  
  log("The first Result : ${myFirstDeferred.await()}")
  log("The second Result : ${mySecondDeffered.await()}")
}