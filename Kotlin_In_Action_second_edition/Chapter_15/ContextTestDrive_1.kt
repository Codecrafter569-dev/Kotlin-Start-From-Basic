import kotlinx.coroutines.*
import kotlinx.coroutines.job
// VVI: is import ki zaroorat hai
fun main() = runBlocking(CoroutineName("A")){
  println("A's job : ${coroutineContext.job}")
  
  launch(CoroutineName("B")){
    println("B's job : ${coroutineContext.job}")
    println("B's parent : ${coroutineContext.job.parent}")
    
    
  }
  
  println("A's children : ${coroutineContext.job.children.toList()}")
}