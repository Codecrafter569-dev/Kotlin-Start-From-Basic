import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds
import kotlin.time.Duration.Companion.milliseconds
suspend fun fetchDataFromServer(serverDelay : Long): String{
  delay(serverDelay)
  return "Server se data aaaya !!"
}
fun main(){
 runBlocking{
   println("==== Fast Server (1s) =====")
   val fastResult = withTimeoutOrNull(2.seconds){
     fetchDataFromServer(1000)
   }
   
   println("Result : ${fastResult ?: "Timeout!"}")
   val slowResult = withTimeoutOrNull(2.seconds){
     fetchDataFromServer(5000)
   }
   println("Result : ${slowResult ?: "Timeout ! "}")
 } 
}