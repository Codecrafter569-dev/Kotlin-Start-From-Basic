import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds
import kotlin.time.Duration.Companion.milliseconds
suspend fun calculateSomething(num : Int): Int{
  delay(3.seconds)
  return num * num
}
fun main(){
  runBlocking{
    val quickResult = withTimeoutOrNull(500.milliseconds){
      calculateSomething(44)
    }
    println("Quick result : (500 timeout) : $quickResult")
    
    val slowResult = withTimeoutOrNull(5.seconds){
      calculateSomething(55)
    }
    println("slow result : (5s timeout) : $slowResult")
  }
}