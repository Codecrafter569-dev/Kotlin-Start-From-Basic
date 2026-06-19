import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun Flow<Int>.doubled(): Flow<Int> = flow{
  collect{ values ->
    emit(values * 2)
  }
}
fun main():Unit = runBlocking{
  flowOf(1,2,3,4,5,6,7)
  .doubled()
  .collect{
    println("Got : $it")
  }
}