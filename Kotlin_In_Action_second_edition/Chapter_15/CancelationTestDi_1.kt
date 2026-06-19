import kotlinx.coroutines.*

fun log(msg : String) = println("${System.currentTimeMillis()  % 10000}  $msg")

suspend fun docpuHeavyWork(): Int{
  log("I'm doing work !!")
  var counter = 0
  val startTime = System.currentTimeMillis()
  
  while(System.currentTimeMillis() < startTime + 500){
    counter++
  }
  return counter
}
fun main(){
  runBlocking{
    val myJob = launch{
      repeat(10){
        docpuHeavyWork()
      }
    }
    delay(600)
    println("Cancelling job ...")
    myJob.cancel()
    println("cancel was Called ...")
  }
}