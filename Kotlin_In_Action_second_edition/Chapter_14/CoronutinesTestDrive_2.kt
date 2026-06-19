import kotlinx.coroutines.*

suspend fun heavyCalculation(): Int{
  delay(1000)
  return 100
}


fun main(){
  runBlocking{
    println("Main thread pe start hua : ${Thread.currentThread().name}")
    
    val result = withContext(Dispatchers.Default){
      println("Beckground thread pe kaam : ${Thread.currentThread().name}  : ")
      
      heavyCalculation()
    }
    println("Result mila : $result")
    
    println("Wapas original thread pe : ${Thread.currentThread().name}")
    
  }
}