import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds
fun main(){
  runBlocking{
    launch{
      delay(1.seconds)
      launch{
        delay(250.milliseconds)
        println("GrandChild was done....")
      }
      println("Child 1 was done ok bro....")
    }
    
    launch{
      delay(500.milliseconds)
      println("Child 2 was done....")
    }
    
    println("Parant was done ....")
  }
}