import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.seconds
suspend fun getTemperature(): Flow<Int>{
  return flow{
    emit(22)
    delay(1.seconds)
    emit(50)
    delay(1.seconds)
    emit(90)
    delay(1.seconds)
  }
}
fun main() = runBlocking{
  println("Starting temperature stream ......")
  getTemperature().collect{ temp -> println("Got temperature  : $temp °C")}
}