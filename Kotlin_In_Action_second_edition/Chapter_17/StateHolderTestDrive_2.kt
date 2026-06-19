import kotlinx.coroutines.flow.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds
class StateHolder<T>(initial : T){
  var value : T = initial
      private set
      
      fun update(newValue : T){
        value = newValue
        println("UI would re-draw ! New state : $value")
      }
}

fun temperatureFlow() = flow{
  val readings = listOf(null,22,25,28,24)
  
  for(reading in  readings){
    delay(500.milliseconds)
    if(reading != null) emit(reading)
  }
}
fun main(): Unit =runBlocking{

val uiState = StateHolder<Int?>(null)

println("Initial UI State : ${ uiState.value ?: "Loading..."}")
  temperatureFlow().collect{ value ->
    uiState.update(value)
  }
}