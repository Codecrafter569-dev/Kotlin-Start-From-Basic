import kotlinx.coroutines.flow.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

suspend fun <T> Flow<T>.bindToUI( initiValue : T, onStateChange : (T) -> Unit){
  onStateChange(initiValue)
  collect{ newValue ->
    onStateChange(newValue)
  }
}

fun stockPriceFlow() = flow{
  emit(150.0)
  delay(400.milliseconds)
  emit(153.9)
  delay(400.milliseconds)
  emit(300.4)
  delay(400.milliseconds)
  emit(200.3)
}
fun main(): Unit = runBlocking{
  println("Stock price Dashboard")
  println("======================")
  
  
  stockPriceFlow().bindToUI(
  initiValue = 0.0,
  onStateChange = { price -> 
  if (price == 0.0) {
    println("Loading pricess....")
  } else {
    println("Current price : $price")
  }
  }
  )
  
}