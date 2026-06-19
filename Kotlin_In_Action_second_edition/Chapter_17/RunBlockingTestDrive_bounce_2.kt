import kotlinx.coroutines.flow.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds
fun main(): Unit = runBlocking{
  val rapidNumbers = flow{
    emit(1)
    delay(50.milliseconds)
    emit(2)
    delay(50.milliseconds)
    emit(3)
    delay(300.milliseconds)
    emit(4)
    delay(50.milliseconds)
    emit(5)
    
  }
  
  rapidNumbers.debounce(200.milliseconds).collect{ values -> println("Passed debounce : $values")
  }
}