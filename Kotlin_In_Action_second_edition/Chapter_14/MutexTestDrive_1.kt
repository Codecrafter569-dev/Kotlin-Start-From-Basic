import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
fun main(){


  runBlocking{
    val mutex = Mutex()
    var x = 0
    
    repeat(10000){
      launch(Dispatchers.Default){
        
        
        mutex.withLock{
          x++
        }
      }
    }
    
    delay(2000)
    println(" Exception : 10000, Actual : $x ")
  }
}