import kotlinx.coroutines.*
fun doHeavyCalculations(id : Int): Int{
  
  var counter = 0
  val start = System.currentTimeMillis()
  while(System.currentTimeMillis() < start+300){
    counter++
  }
  println("Task $id completed , counter = $counter")
  return counter
}
fun main(){
  runBlocking{
    
    val myJob = launch{
      repeat(6){ index ->
        doHeavyCalculations(index +1)
        
        if(!isActive){
          println("Cancel detect hua iteration ${index+1} ke baad ....")
          return@launch
        }
      }
    }
    
    delay(700)
    println("Cancel signal !!")
    myJob.cancel()
    myJob.join()
    println(" Done ....")
  }
}