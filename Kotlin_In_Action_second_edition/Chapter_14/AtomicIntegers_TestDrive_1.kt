import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger
fun main(){
  runBlocking{
    val x = AtomicInteger(0)
    
    repeat(10000){
      launch(Dispatchers.Default){
        x.incrementAndGet()
      }
    }
    delay(2000)
    
    println("Result : $x")
    println("Result : ${x.get()}")
  }
}