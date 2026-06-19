import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*
import kotlin.random.Random
class CommunicationException : Exception("Communication failded ....")

val unrealiableFlow = flow{
  println("Starting the flow ...")
  repeat(10){ number ->
  if(Random.nextDouble() < 0.1) throw CommunicationException()
  emit(number)
  }
}
fun main():Unit = runBlocking{
  unrealiableFlow
  .retry(5){ cause ->
  println("Handled  : $cause")
  cause is CommunicationException
  }.collect{
    println("number : $it")
  }
}