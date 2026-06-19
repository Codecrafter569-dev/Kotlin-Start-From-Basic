import kotlinx.coroutines.flow.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds
fun producer() = flow{
  repeat(4){ i ->
  delay(100)
  
  println("Emitting $i")
  emit(i)
  }
}
fun main(): Unit = runBlocking{
  val startTime = System.currentTimeMillis()
  
  producer().collect { value ->
    delay(300)
    
    println("collected $value | Time : ${System.currentTimeMillis() - startTime}ms")
  }
  
  println("Total : ${System.currentTimeMillis() - startTime}ms")
}