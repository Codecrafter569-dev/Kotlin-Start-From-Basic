import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds
suspend  fun getTemperatureBad(): List<Int>{
  return buildList{
    add(22)
    delay(1.seconds)
    add(25)
    delay(1.seconds)
    add(90)
    delay(1.seconds)
  }
}
fun main()  = runBlocking{
  println("Waiting for all temperature .....")
  val temps = getTemperatureBad()
  temps.forEach{ println("Temperature : $it °C")}
}