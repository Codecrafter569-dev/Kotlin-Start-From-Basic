import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
class UnhappyFlowException : Exception()

val exceptionalFlow = flow{
  repeat(5){ numbers -> 
  emit(numbers)
  }
  throw UnhappyFlowException()
}
fun main():Unit = runBlocking{
  exceptionalFlow.catch{ cause ->
  println("\n Handled : $cause")
  emit(-2)
  }.collect{
    println("$it")
  }
}