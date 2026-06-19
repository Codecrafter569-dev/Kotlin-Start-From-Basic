import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds
suspend fun fetchStockPrice(ticker : String): Double{
  delay(400.milliseconds)
  return when(ticker){
    "AAPL" -> 182.50
    "GOOGL"  -> 141.20
    else -> 0.0
  }
}

fun stockPriceFlow(): Flow<String> = flow{
  val applePrice = fetchStockPrice("AAPL")
  emit("Apple : $applePrice ¥")
  
  delay(200.milliseconds)
  val googlePrice = fetchStockPrice("GOOGL")
  emit("Google : $googlePrice$")
}
fun main()= runBlocking{
  println("Fetching stock prices...")
  stockPriceFlow().collect{ priceInfo -> 
  println(" $priceInfo")
  }
}