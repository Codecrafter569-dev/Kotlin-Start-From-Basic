import kotlinx.coroutines.*

suspend fun fetchData(id: Int): String {
    delay(500) // coroutine pause
    return "Data_$id"
}

fun main() = runBlocking {
    // Dono coroutines ek saath chalte hain — thread ek hi hai!
    val job1 = launch {
        val result = fetchData(1)
        println("Coroutine 1 got: $result")
    }
    println("the job 1 was completed...")
    val job2 = launch {
        val result = fetchData(2)
        println("Coroutine 2 got: $result")
    }
    println("The job 2 was completed ...")
    job1.join()
    job2.join()
    println("Done! Single thread ne dono handle kiye.")
}
