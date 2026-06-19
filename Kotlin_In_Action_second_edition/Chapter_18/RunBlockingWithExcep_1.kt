import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds
fun main():Unit = runBlocking{
  val exceptionHandler = CoroutineExceptionHandler{_,e ->
    println("[HANDLER] this fires for launch : ${e.message}")
  }
  val scope = CoroutineScope(SupervisorJob()+Dispatchers.Default + exceptionHandler)
  
  println("Outer async : Exception stored in derefred ===")
  
  val deferred = scope.async{
    delay(200)
    throw IllegalStateException("async outermost exception!")
  }
  
  delay(500)
  println("Handler was NOT called (async at root stores exception in Deferred)")
    println("Now calling await() to retrieve the stored exception...")
    
    try {
      deferred.await()
    } catch (e: IllegalStateException) {
    //  e.printStackTrace()
    
    println("Caught from await(): ${e.message}")
    }
    scope.cancel()
}