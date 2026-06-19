import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
fun main(): Unit = runBlocking{
  val numbers = flow{
    emit(1)
    emit(2)
    emit(3)
  }
  
  val result = numbers.transform{ num-> 
  emit(num) 
  emit(num * 2)
  }
  result.collect{ print("$it, ")}
}