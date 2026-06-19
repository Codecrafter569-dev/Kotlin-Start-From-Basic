import kotlinx.coroutines.flow.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
fun main(): Unit = runBlocking{
  flowOf("Raw_data")
  .onEach{
    println("Step = A Reading data on : ${Thread.currentThread().name}")
    
  }
  .flowOn(Dispatchers.IO)
  .onEach{
    println("Step = B Reading data on : ${Thread.currentThread().name}")
  }
  .flowOn(Dispatchers.Default)
  .onEach{
    println("Step = C Reading data on : ${Thread.currentThread().name}")
  }
  .collect()
}