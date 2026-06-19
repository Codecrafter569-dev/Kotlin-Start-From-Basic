import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

fun main(){
  runBlocking{
    
    GlobalScope.launch{
      delay(1000.milliseconds)
      launch{
        delay(250.milliseconds)
        println("Grandchild done ....")
      }
      println("Chile 1 was done ...")
    }
    
    GlobalScope.launch{
      delay(500.milliseconds)
      println("Child 2 done !!")
    }
    println("Parent done !!")
  }
}