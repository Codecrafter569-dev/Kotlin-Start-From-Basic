import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class UnsafeCounter{
  val count = MutableStateFlow(0)
  
  fun increment(){
    count.value = count.value +1
  }
}
fun main(){
  
  runBlocking(Dispatchers.Default){
    val counter = UnsafeCounter()
    
    val jobs = List(1000){
      launch{
        counter.increment()
        
      }
    }
    jobs.forEach{it.join()}
    
    println("Expected : 1000")
    println("Actual : ${counter.count.value}")
  }
}