import kotlinx.coroutines.*
fun processData(batchId : Int){
  var sum = 0
  val startTime = System.currentTimeMillis()
  while(System.currentTimeMillis() < startTime + 300){
    sum++
  }
  println("Batch $batchId processed !!...")
}
fun main(){
  runBlocking{
    val myJob = launch{
      repeat(6){ index -> 
      processData(index+1)
      
      ensureActive()
      
      println("Batch ${index+1} after ensureActive passed !!")
      }
    }
    
    delay(700)
    println(" Cancel signal !!")
    myJob.cancel()
    myJob.join()
    println("Job ended ...")
  }
}