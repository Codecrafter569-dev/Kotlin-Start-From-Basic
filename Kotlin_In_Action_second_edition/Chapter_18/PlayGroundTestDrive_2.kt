import kotlinx.coroutines.*
import kotlinx.coroutines.test.*
import kotlin.test.*
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds
@OptIn(ExperimentalCoroutinesApi::class)
fun main()= runTest{
//val startTime = System.concurrentTimeMillis()
  var x = 0
  launch{
    delay(500.milliseconds)
    x++
  }
  launch{
    delay(1.seconds)
    x++
  }
  
//  println("")

println(currentTime)
delay(600.milliseconds)
assertEquals(1,x)
println(currentTime)
delay(500.milliseconds)
assertEquals(2,x)
println(currentTime)
}