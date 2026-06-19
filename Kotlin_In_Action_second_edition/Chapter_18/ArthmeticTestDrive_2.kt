import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
fun main():Unit = runBlocking{
  val numbers = flow{
    emit(10)
    emit(9)
    emit(8)
    emit(7)
    emit(6)
    emit(5)
    emit(0)
  }
  try {
    numbers.map{ value ->
      val result = 100/ value
      println("Processed $value  -> Result it  $result")
      result
    }.collect{ result ->
      println("Collected : $result")
    }
  } catch (e: ArithmeticException) {
    //e.printStackTrace()
    
    println("Caught: Division by zero somewhere in the flow pipeline!")
        println("Exception message: ${e.message}")
  }
}