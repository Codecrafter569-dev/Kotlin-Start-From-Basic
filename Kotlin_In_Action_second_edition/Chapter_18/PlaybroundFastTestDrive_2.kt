import kotlinx.coroutines.*
import kotlinx.coroutines.test.*
import kotlin.test.*
import kotlin.time.Duration.Companion.seconds
fun main() = runTest{
  val startTime = System.currentTimeMillis()
  delay(20.seconds)
  println(System.currentTimeMillis() - startTime)
  
}