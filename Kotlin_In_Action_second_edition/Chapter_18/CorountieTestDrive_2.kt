import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds

// This class simulates a UI component or ViewModel-like class
// that owns its own coroutine scope
class NetworkComponent(dispatcher: CoroutineDispatcher = Dispatchers.Default) {

    // Step 1: Create a custom exception handler
    // This fires when an uncaught exception reaches the root of THIS scope
    private val exceptionHandler = CoroutineExceptionHandler { context, exception ->
        println("[ERROR HANDLER] Caught: ${exception::class.simpleName} — ${exception.message}")
        println("[ERROR HANDLER] The scope is still alive. Other jobs can run.")
    }

    // Step 2: Create the scope with SupervisorJob + handler
    // SupervisorJob: one child failure doesn't cancel others
    // exceptionHandler: catches uncaught exceptions at the root
    private val scope = CoroutineScope(SupervisorJob() + dispatcher + exceptionHandler)

    fun loadUserData() = scope.launch {
        println("loadUserData: Starting...")
        delay(300)
        throw RuntimeException("Failed to connect to user API!")
        // This exception escapes to the scope, goes to exceptionHandler
    }

    fun loadProductList() = scope.launch {
        println("loadProductList: Starting...")
        delay(500)
        println("loadProductList: Loaded 25 products successfully!")
    }

    fun cancel() = scope.cancel()
}

fun main(): Unit = runBlocking {
    val component = NetworkComponent(dispatcher = Dispatchers.Unconfined)

    // Launch both jobs — they are independent due to SupervisorJob
    component.loadUserData()
    component.loadProductList()

    // Give enough time for both to complete
    delay(2.seconds)

    println("Main: Both jobs attempted. Component scope is still running!")
    component.cancel()
}
