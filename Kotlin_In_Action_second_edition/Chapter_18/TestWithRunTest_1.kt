import kotlinx.coroutines.*
import kotlinx.coroutines.test.*
import kotlin.test.assertEquals
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

@OptIn(ExperimentalCoroutinesApi::class)
fun main() = runTest {
    var x = 0

    launch {
        delay(500.milliseconds)
        x++
        println("First coroutine finished at $currentTime ms")
    }

    launch {
        delay(1.seconds)
        x++
        println("Second coroutine finished at $currentTime ms")
    }

    println("Current time = $currentTime ms")
    println("x = $x")

    delay(20.milliseconds)

    println("Current time = $currentTime ms")
    println("x = $x")

    assertEquals(0, x) // Passes because only 20ms have elapsed

    println("Assertion passed!")
}