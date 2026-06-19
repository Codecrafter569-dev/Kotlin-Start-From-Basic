import kotlinx.coroutines.*
import kotlinx.coroutines.test.*
import kotlin.test.*
import kotlin.time.Duration.Companion.milliseconds
@OptIn(ExperimentalCoroutinesApi::class)
fun main() = runTest{
  var x = 0
  
  launch{
    x++
    launch{
      x++
    }
  }
  launch{
   // do {
    delay(200.milliseconds)
   // } while (condition)
   x++
  }
  println("Current Time is :$currentTime")
  runCurrent()
  assertEquals(2,x)
  println("Now Time to Become Is : $currentTime")
  println("And value is : $x")
  advanceUntilIdle()
  assertEquals(3,x)
  println("Total time is : $currentTime")
  println("And Total value is : $x")
}