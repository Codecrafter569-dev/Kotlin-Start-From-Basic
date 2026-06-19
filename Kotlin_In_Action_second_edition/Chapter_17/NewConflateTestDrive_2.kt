import kotlinx.coroutines.flow.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

fun temperatureSensorTestDrive() = flow{
  val readings = listOf(22,23,34,56,23,22,28,26,25,12,10)
  for(read in readings){
    delay(300)
    println("Sensor was Read : $read")
    emit(read)
  }
}
fun main(): Unit = runBlocking{
  temperatureSensorTestDrive().conflate().collect{ temps ->
  println("Dispalaying : $temps")
  delay(1.seconds)
    
  }
}