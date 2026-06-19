import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

suspend fun doSomeThingSlowly(){
  delay(500.milliseconds)
  
  println("I 'm Done...")
}
fun main() = runBlocking{
  doSomeThingSlowly()
}