import kotlinx.coroutines.*

suspend fun fetchData(shouldFail: Boolean): Int {
    delay(100) // Simulating some work
    if (shouldFail) {
        throw RuntimeException("Network error! Could not fetch data.")
    }
    return 42
}

fun main(): Unit = runBlocking {

    // =============================================
    // Case 1: async throws, we catch at await()
    // =============================================
    println("--- Case 1: Catching exception at await() ---")
    
    // async stores the exception inside the Deferred — no crash yet
    val failingDeferred: Deferred<Int> = async {
        fetchData(shouldFail = true) // This will throw internally
    }
    
    // The exception is only re-thrown here at await()
    try {
        val result: Int = failingDeferred.await()
        println("Result: \$result") // This line won't be reached
    } catch (e: RuntimeException) {
        // We catch the exception that was stored inside the Deferred
        println("Caught at await(): ${e.message}")
    }

    // =============================================
    // Case 2: async succeeds, await() returns value
    // =============================================
    println("\n--- Case 2: Successful async ---")
    
    val successDeferred: Deferred<Int> = async {
        fetchData(shouldFail = false) // This will return 42
    }
    
    try {
        val result: Int = successDeferred.await()
        println("Got result successfully: $result")
    } catch (e: RuntimeException) {
        println("This won't print")
    }
}
