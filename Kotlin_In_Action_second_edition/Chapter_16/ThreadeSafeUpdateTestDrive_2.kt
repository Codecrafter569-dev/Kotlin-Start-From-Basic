import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
class SafeCounter{
  val count = MutableStateFlow(0)
  
  fun increement(){
    count.update{ currentValue -> currentValue + 1}
  }
}
fun main(){
  runBlocking(Dispatchers.Default){
    val counter = SafeCounter()
    
    val jobs = List(1000){
      launch{
        counter.increement()
      }
    }
    jobs.forEach{ it.join()}
    
    println("Excepted Output : 1000")
    println("Actual : ${counter.count.value}")
  }
}