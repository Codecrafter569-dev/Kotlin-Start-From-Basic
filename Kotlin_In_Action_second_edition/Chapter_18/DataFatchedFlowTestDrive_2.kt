import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
class DataFetchedException(message : String): Exception(message)

val fetchedFlow = flow{
  for(i in 1..6){
    if(i == 3){
      throw DataFetchedException("Server error at item $i")
    }
    println("Emitting item $i")
    emit(i)
  }
}
fun main():Unit = runBlocking{
  println("Starting collection ....")
  try {
    fetchedFlow.collect{ item ->
    println("Recived : $item")
    }
  } catch (e: DataFetchedException) {
    //e.printStackTrace()
    
    println("Flow failed: ${e.message}")
        println("Items 1 and 2 were already processed before the error.")
        println("Items 3-6 were never emitted because flow stopped.")
  }
  println("Program continue after handling the error...")
}