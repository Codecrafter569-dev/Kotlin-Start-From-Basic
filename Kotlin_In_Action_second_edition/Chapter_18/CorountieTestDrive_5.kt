import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds

@OptIn(DelicateCoroutinesApi::class)
fun main(): Unit = runBlocking {

    // =============================================
    // Case 1: Handler on ROOT coroutine — IT FIRES
    // =============================================
    println("=== Case 1: Handler on ROOT coroutine ===")

    val rootHandler = CoroutineExceptionHandler { _, e ->
        println("[ROOT HANDLER] Fired! Exception: ${e.message}")
    }

    // GlobalScope.launch creates a ROOT coroutine (no parent)
    // So the handler on it WILL fire
    val job = GlobalScope.launch(rootHandler) {
        throw IllegalStateException("Exception from root coroutine!")
    }
    job.join() // Wait for it to complete

    delay(200)

    // =============================================
    // Case 2: Handler on CHILD coroutine — it does NOT fire
    // =============================================
    println("\n=== Case 2: Handler on CHILD coroutine ===")

    val childHandler = CoroutineExceptionHandler { _, e ->
        // This will NEVER be called — child handlers are ignored
        println("[CHILD HANDLER] I was called! Exception: ${e.message}")
    }

    try {
        coroutineScope {
            // This launch creates a CHILD coroutine of coroutineScope
            // The childHandler on a child coroutine is IGNORED
            // Exception propagates to parent (coroutineScope) instead
            launch(childHandler) {
                throw IllegalStateException("Exception from child coroutine!")
            }
        }
    } catch (e: IllegalStateException) {
        // The exception bypassed childHandler and came here
        println("[OUTER CATCH] Caught (child handler was ignored): ${e.message}")
    }

    println("\nDone!")
}
