import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds

class ComponetWithScope(dispatcher : CoroutineDispatcher = Dispatchers.Default){
  private val exceptionHandler = CoroutineExceptionHandler{_ , e ->
    println("[Erorr] ${e.message}")
  }
  
  private val scope = CoroutineScope(SupervisorJob()+dispatcher+ exceptionHandler)
  
  fun action() = scope.launch{
    async{
      throw UnsupportedOperationException("Ouch!")
    }
  }
  
}
fun main():Unit = runBlocking{
  val superviorTest = ComponetWithScope()
  superviorTest.action()
  delay(1.seconds)
  
}