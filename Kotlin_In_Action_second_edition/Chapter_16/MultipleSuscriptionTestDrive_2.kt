import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds

fun main(){
  runBlocking{
    
    val broadcastFlow = MutableSharedFlow<String>()
    
    launch{
     val news = listOf("Breaking: Rain today",
                          "Sports: Team wins",
                          "Tech: New phone launched")
                          
    for(item in news){
      delay(400.milliseconds)
      println("[NEWS CHANNEL] Broadcasting : $item")
      broadcastFlow.emit(item)
    }
    }
    launch{
      broadcastFlow.collect{
        println("[TV viwer A Got : $it")
      }
    }
    launch{
      broadcastFlow.collect{
        println("[TV viwer B Got : $it")
      }
    }
    delay(1500.milliseconds)
    println("Done!!")
    cancel()
  }
}