import kotlinx.coroutines.*
fun log(msg : String) = println("${System.currentTimeMillis() % 10000}  $msg")
suspend fun doSomeWork() : Int{
  log("I'm doing work !! !")
  
  var counter = 0
  val startTime = System.currentTimeMillis()
  while(System.currentTimeMillis() < startTime + 500){
    counter++
    delay(1)
  }
  return counter
}


fun main(){
  runBlocking{
    val myJob = launch{
      repeat(5){
        doSomeWork()
      }
    }
    
    delay(600)
    println(" >>> Cancel signal bhejaa !!")
    myJob.cancel()
    myJob.join()
    println("Job cancel ho gaya >.....")
  }
}