import kotlinx.coroutines.flow.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
fun heavyComputions() = flow{
  println("Computing on : ${Thread.currentThread().name}")
  
  val result = (1..100000).sum()
  emit(result)
}
fun main(): Unit = runBlocking{
  heavyComputions().flowOn(Dispatchers.Default).collect{
    result ->
    println("collected On : ${Thread.currentThread().name}")
    println("Result : $result")
  }
}