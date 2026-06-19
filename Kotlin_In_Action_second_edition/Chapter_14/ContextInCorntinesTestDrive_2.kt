import kotlinx.coroutines.*
import kotlin.coroutines.coroutineContext
suspend fun introspect(){
  println("Mera context hai : $coroutineContext")
}
fun main(){
  runBlocking{
    introspect()
  }
  
}