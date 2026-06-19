import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

class ComponentWithScope(
dispatcher : CoroutineDispatcher  = Dispatchers.Default){
  
  
  private val scope = CoroutineScope(dispatcher+ SupervisorJob())
  
  fun start(){
    println("Components starting !!")
    scope.launch{
      while(true){
        delay(500.milliseconds)
        println("Components working ! Thread : ${Thread.currentThread().name}")
      }
    }
    
    scope.launch{
      println("One-off task shuru ....")
      delay(500.milliseconds)
      println("One-off task done !!!")
    }
  }
  
  fun stop(){
    println("Component stoppings ....")
    scope.cancel()
  }
}

fun main(){
  val componet = ComponentWithScope()
  
  componet.start()
  Thread.sleep(2000)
  componet.stop()
  Thread.sleep(500)
  
  println("Main program exit ....")
}