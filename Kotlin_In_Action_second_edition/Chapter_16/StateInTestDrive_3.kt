import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.random.*
import kotlin.time.Duration.Companion.milliseconds
fun getTemperature(): Flow<Int>{
  return flow{
    while(true){
      val temp = Random.nextInt(-10..30)
      println("[Sensor] Reading temperatures : $temp °C")
      emit(temp)
      delay(500.milliseconds)
    }
  }
}
fun main(){
runBlocking{
  val temps = getTemperature()
  
  val stateFlow = temps.stateIn(this)
  
  println("[APP] Current temperatures : ${stateFlow.value}")
  
  delay(900.milliseconds)
  
  println("[APP] Temperatures after 800ms : ${stateFlow.value} °C")
  cancel()
  
  }
}