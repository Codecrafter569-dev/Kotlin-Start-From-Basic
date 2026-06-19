import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds

fun main(){
  runBlocking{
    val flow = MutableSharedFlow<Int>()
    launch{
       for(i in 1..10){
         println("[EMIT] Sending $i")
         flow.emit(i)
        delay(200.milliseconds)
       }
    }
    
    delay(500.milliseconds)
    println("[SUBSCRIBER] JOINING NOW (later)......")
    
    var count = 0
    flow.collect{
      println("[SUBSCRIBER] Got : $it")
      count++
      if(count >= 2 ) return@collect
    }
    cancel()
  }
}