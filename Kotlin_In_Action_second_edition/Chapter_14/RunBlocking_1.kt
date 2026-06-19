import kotlinx.coroutines.*
fun main() = runBlocking{
  println("Main Start")
  
  
  val job = launch{
    delay(100)
    println("coroutines inside launch....")
  }
  println("Main continues (launch non-blocking hai)")
  job.join()
  println("Main end to end increpted...")
}