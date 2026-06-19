import kotlinx.coroutines.*

fun main(){
  runBlocking{
    var x = 0
    
    repeat(10000){
      launch(Dispatchers.Default){
        x++
      }
    }
    
    delay(2000)
    
    println(" Expected : 10000  And $x")
  }
}