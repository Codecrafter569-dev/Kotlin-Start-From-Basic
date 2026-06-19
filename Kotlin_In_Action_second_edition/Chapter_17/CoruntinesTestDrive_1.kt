import kotlinx.coroutines.*

fun main(): Unit = runBlocking {

    // =============================================
    // WRONG APPROACH — try-catch OUTSIDE launch
    // =============================================
    
    /*
    println("--- Wrong Approach ---")
    try {
        launch {
            // This exception is thrown AFTER the try-catch has already exited
            throw UnsupportedOperationException("Ouch from wrong approach!")
        }
        // By the time coroutine runs, we're already past this try block
    } catch (e: UnsupportedOperationException) {
        // This line will NEVER be reached
        println("This will not print: \${e.message}")
    }
*/

    // Give the coroutine time to run before moving on
    delay(100)

    // =============================================
    // CORRECT APPROACH — try-catch INSIDE launch
    // =============================================
    println("\n--- Correct Approach ---")
    launch {
        // Now the try-catch lives IN the same execution context as the throw
        try {
            throw UnsupportedOperationException("Ouch from correct approach!")
        } catch (e: UnsupportedOperationException) {
            // This WILL be reached because try-catch is inside the coroutine
            println("Caught inside coroutine: ${e.message}")
        }
    }

    delay(100)
    println("main() finished")
}