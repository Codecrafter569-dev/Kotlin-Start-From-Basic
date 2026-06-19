import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

fun main(){
  runBlocking{
    
    val launchedJob = launch{
      println("Launched coroutine started ...")
      delay(1000.milliseconds)
      println("Launched coroutine done !!")
    }
    
    
    val asyncDeferred = async{
      println("Async coroutine shuru !!")
      delay(1000.milliseconds)
      
      println("Async coroutine done !!")
    }
    delay(200.milliseconds)
    
    launchedJob.cancel()
    asyncDeferred.cancel()
  }
}