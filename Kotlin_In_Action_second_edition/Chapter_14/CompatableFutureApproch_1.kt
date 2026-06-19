import kotlinx.coroutines.*
import java.util.concurrent.CompletableFuture

// Book wala CompletableFuture approach
fun loginAsync(creds: String): CompletableFuture<String> =
    CompletableFuture.supplyAsync { Thread.sleep(300); "UserID_001" }

fun loadUserDataAsync(userID: String): CompletableFuture<String> =
    CompletableFuture.supplyAsync { Thread.sleep(300); "Vikash" }

// Chain operators lagte hain
fun futureVersion(creds: String) {
    loginAsync(creds)
        .thenCompose { loadUserDataAsync(it) }  // chain!
        .thenAccept { println("Future: \$it") }  // chain!
        .get() // block karo result ke liye
}

// Coroutine version — same logic, clean look
suspend fun coroutineVersion(creds: String) {
    val userID = loginAsync(creds).await()        // await extension
    val userData = loadUserDataAsync(userID).await()
    println("Coroutine: \$userData")
}

fun main() = runBlocking {
    futureVersion("creds")
    coroutineVersion("creds")
}
