import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds
fun heartbeatFlow(): Flow<Int> = flow{
  var beat = 0
  while(true){
    beat++
    delay(500.milliseconds)
    emit(beat)
  }
}
fun main(){
  runBlocking{
    println("° Starting heart monitor ....")
    val monitorJob = launch{ 
      heartbeatFlow().collect{ beat -> println("° Heartbeat #$beat")
      }
    }
    
    delay(4.seconds)
    monitorJob.cancel()
    println(" Heart monitor stopped....")
  }
}