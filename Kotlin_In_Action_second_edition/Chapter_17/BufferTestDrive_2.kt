import kotlinx.coroutines.flow.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds
fun produce() = flow{
  repeat(4){ i ->
    delay(100)
    
    println("Emitting $i")
    emit(i)
  }
}
fun main(): Unit = runBlocking{
  val starting = System.currentTimeMillis()
  
  produce().buffer(3).collect{ values -> println("Collected $values | Time : ${System.currentTimeMillis() - starting}ms")}
  
  println("Total : Times ${System.currentTimeMillis()- starting}ms")
}