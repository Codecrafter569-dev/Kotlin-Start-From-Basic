import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds
class ServerUnavailbleException : Exception("Server is busy !!!")
var tryCount = 0
val flakeyServerFlow = flow{
  tryCount++
  println("Trying to connect (Attempts : $tryCount)")
  if(tryCount < 4){
    throw ServerUnavailbleException()
  }
  emit("Connected ! Got data ${listOf("A","B","C","D")}")
}
fun main():Unit = runBlocking{
  flakeyServerFlow.retry(5){ cause ->
    if(cause is ServerUnavailbleException){
      println("Server unavailble . Waiting before retry...")
      
      delay(200.milliseconds)
      println("Retrying now ...")
      true
    }else{
      false
    }
  }
  .collect{
    println("Success : $it")
  }
  println("Total connection attempts made: $tryCount")
}