import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
class UnHappyFlowException : Exception()

fun main():Unit = runBlocking{
val exceptionFlow = flow{
  repeat(5){ number ->
  emit(number)
  }
  throw UnHappyFlowException()
}

val transformedFlow = exceptionFlow.map{
  it * 2
  
}

try {
  transformedFlow.collect{
    println("$it")
  }
} catch (e: UnHappyFlowException) {
  //e.printStackTrace()
  println("\nHandled : $e")
}
}