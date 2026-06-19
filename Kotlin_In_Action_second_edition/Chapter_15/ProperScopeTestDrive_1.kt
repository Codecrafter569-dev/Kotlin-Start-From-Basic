import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

fun main(){
  runBlocking{
    
    launch{
      delay(1000.milliseconds)
      launch{
        delay(250.milliseconds)
        print("Grand child was done....")
      }
      println("Child 1 was done...")
    }
    
    launch{
      delay(500.milliseconds)
      println("Child 2 done !!")
    }
    
    println("Parant done !!!")
  }
}