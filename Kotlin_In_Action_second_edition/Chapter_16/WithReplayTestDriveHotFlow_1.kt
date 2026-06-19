import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds


fun main(){
  runBlocking{
    val flow = MutableSharedFlow<Int>(replay = 3)
    
    launch{
      for(i in 1..10){
        println("[EMIT] Sending $i")
        flow.emit(i)
        delay(100.milliseconds)
      }
    }
    
    
    delay(500.milliseconds)
    println("[SUBSCRIBER] joing LATE .....")
    var count = 0
    
    flow.collect{
      println("[SUBSCRIBER] Got (replayed): $it")
      count++
      if(count >= 3) return@collect
    }
    println("[SUBSCRIBER] I got the history even though I joined late!")
  }
}