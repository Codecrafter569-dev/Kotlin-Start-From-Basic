import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
class UnhappyFlowException : Exception()

val exceptionFlow = flow{
  repeat(6){ numbers -> emit(numbers)}
  throw UnhappyFlowException()
}
fun main():Unit = runBlocking{
  exceptionFlow.map{it +1}
  .catch{ cause ->
  println("Handled   $cause")
  }.onEach{
    throw UnhappyFlowException()
  }.collect()
}