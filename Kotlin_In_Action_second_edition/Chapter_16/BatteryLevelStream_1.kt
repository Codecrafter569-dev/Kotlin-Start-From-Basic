import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.random.*
import kotlin.time.Duration.Companion.milliseconds


fun batteryLevelStream(): Flow<Int>{
  return flow{
    var level = 100
    while(level > 0){
    emit(level)
      println("[Battery HW] Battery at $level%")
     // do {
        
      //} while (condition)
      delay(300.milliseconds)
      level -= Random.nextInt(5..15)
    }
    emit(0)
    println("Battery about to died....!!!---_")
  }
}
fun main(){
runBlocking{
  val batteryFlow = batteryLevelStream()
  
  val batteryState = batteryFlow.stateIn(this)
  
  repeat(5){ i ->
  delay(400.milliseconds)
  val level = batteryState.value
  
  val status = when{
    level > 50 -> "Goood"
    level  > 20 -> "Low"
    else   -> "Cirtical"
  }
  println("[APP CHECK $i] Battery: $level% — $status")
  }
  cancel()
  }
}