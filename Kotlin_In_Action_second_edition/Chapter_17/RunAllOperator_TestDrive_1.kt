import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
fun main(): Unit = runBlocking{
  flowOf(10,20,30,40).onStart{
    println("Flow was started....")
  }.onEach{num ->
    println("Processing: $num")
  }.onCompletion{ cause ->
  if(cause == null ){
    println("Flow was completed ...")
  }else{
    println("Flow failded : $cause")
  }
  }.collect{ num ->
    println("collected : $num")
  }
  
  
}