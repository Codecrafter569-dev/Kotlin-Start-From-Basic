import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
fun main(): Unit = runBlocking{
  val temperatures = flow{
    emit(20)
    emit(25)
    emit(29)
    emit(30)
    emit(40)
    emit(44)
    emit(47)
  }
  
  val result = temperatures.takeWhile{ temp -> temp < 30}
  result.collect{ println("$it")}
}