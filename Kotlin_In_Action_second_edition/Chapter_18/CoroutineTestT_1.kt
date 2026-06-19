import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds
class ComponetOfAsyncTest(dispatcher: CoroutineDispatcher = Dispatchers.Default){
  private val exceptionHandler = CoroutineExceptionHandler{_,e ->
    println("[Error] ${e.message}")
  }
  
  private val scope = CoroutineScope(SupervisorJob()+ dispatcher+ exceptionHandler)
  
  fun action() = scope.async{
    launch{
      throw UnsupportedOperationException("Ouch!")
    }
  }
}
fun main():Unit = runBlocking{
  val cor1  = ComponetOfAsyncTest()
  
  cor1.action()
  delay(1.seconds)
}