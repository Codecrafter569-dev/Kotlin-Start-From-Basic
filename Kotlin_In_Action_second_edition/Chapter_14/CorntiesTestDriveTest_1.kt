import kotlinx.coroutines.*
import kotlin.coroutines.coroutineContext

suspend fun introspect(){
  val name = coroutineContext[CoroutineName]?.name  ?: "No Name"
  
  val thread = Thread.currentThread().name 
  println("Coroutine name : $name  | Thread : $thread")
}
fun main(){
  runBlocking(Dispatchers.Default + CoroutineName("Vikash - Coroutine")){
    introspect()
    
    withContext(CoroutineName("Child - Coroutine")){
      introspect()
    }
    introspect()
  }
  
}