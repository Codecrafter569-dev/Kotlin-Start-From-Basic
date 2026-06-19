import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds

fun main(): Unit = runBlocking{
  val handler = CoroutineExceptionHandler{_,e ->
  println("[HANDLER FIRED] Exception : ${e.message}")
  }
  val scope = CoroutineScope(SupervisorJob()+Dispatchers.Unconfined + handler)
  
  println("===== Case 1 : Launch at root ====")
  scope.launch{
    throw RuntimeException("I came from a launch coroutine")
  }
  
  delay(200)
  
  println("===== Case 2 : async at root ====")
 val derrered = scope.async{
    throw RuntimeException("I came from an async coroutine..")
  }
  try {
    derrered.await()
  } catch (e : RuntimeException) {
   // e.printStackTrace()
   println("Caught : at ${e.message}")
  }
  
  delay(200)
  
  println("\nObserve : Case 1 triggered the handler , case 2 did not !!!...")
  scope.cancel()
}