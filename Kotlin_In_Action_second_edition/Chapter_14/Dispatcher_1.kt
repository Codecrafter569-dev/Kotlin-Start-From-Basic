import kotlinx.coroutines.*

fun main() {
    runBlocking {

        // Dispatchers.Default — CPU heavy kaam ke liye
        launch(Dispatchers.Default) {
            println("Default dispatcher: ${Thread.currentThread().name}")

            val result = (1..1_000_000).sum()

            println("Default result: $result")
        }

        // Dispatchers.IO — Blocking operations ke liye
        launch(Dispatchers.IO) {
            println("IO dispatcher: ${Thread.currentThread().name}")

            Thread.sleep(100)

            println("IO task done")
        }

        // Parent dispatcher inherit karega
        launch {
            println("Inherited dispatcher: ${Thread.currentThread().name}")
        }
    }
}