import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
class ViewCounter{
  private val _counter = MutableStateFlow(0)
  
  val counter = _counter.asStateFlow()
  
  fun increments(){
    _counter.update{ currentValue -> currentValue +1 }
  }
}
fun main(){
  runBlocking{
    
    val vc = ViewCounter()
    
    println("Initial count : ${vc.counter.value}")
    vc.increments()
    vc.increments()
    vc.increments()
    println("After 3 increments : ${vc.counter.value}")
    
    launch{
      vc.counter.collect{
        println("[Subscrible] Counter is now : $it")
      }
    }
    
    delay(100)
    vc.increments()
    vc.increments()
    delay(100)
    cancel()
  }
}