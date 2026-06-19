import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.random.*
import kotlin.time.Duration.Companion.milliseconds

fun getTemperatures(): Flow<Int>{
  return flow{
    while(true){
      val temp = Random.nextInt(-10..30)
      println("[SENSOR] Physically querying sensor..... got $temp °C")
      emit(temp)
      delay(500.milliseconds)
    }
  }
}
fun main(){
  runBlocking{
  val temps = getTemperatures()
    launch{
      temps.collect{
        println("[Celsius Display] $it °C")
      }
    }
    
    launch{
      temps.collect{
        val f = it * 9.0/5.0 +32.0
        println("[Fahrenheit Display] ${"%.1f".format(f)} °F")
      }
    }
    delay(700.milliseconds)
    cancel()
  }
}