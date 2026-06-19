import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.random.*
import kotlin.time.Duration.Companion.milliseconds
fun getTemperatues(): Flow<Int>{
  return flow{
    while(true){
      val temp = Random.nextInt(-10..30)
      println("[SENSOR] Querying sendor ... got $temp °C")
      emit(temp)
      delay(500.milliseconds)
    }
  }
}

fun calsuiusToFarenheit(c : Int) = c * 9.0/5.0 + 32.0
fun main(){
  runBlocking{
    val temps = getTemperatues()
    val sharedTemps = temps.shareIn(this,SharingStarted.Lazily)
    launch{
      sharedTemps.collect{
        println("[Celsius Display] $it °C")
      }
    }
    launch{
      sharedTemps.collect{
        val f = calsuiusToFarenheit(it)
        println("[Fahrenheit Display] ${"%.1f".format(f)}°F")
      }
    }
    delay(1000.milliseconds)
    cancel()
  }
}