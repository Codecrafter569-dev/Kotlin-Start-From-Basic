import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds
fun main(){
  runBlocking{
    
    val parantJob = launch{
      launch{
        repeat(100){
          delay(100.milliseconds)
          println("Worker A : Step $it")
        }
      }
      
      launch{
        repeat(100){
          delay(150.milliseconds)
          println("Worker B : Step : $it")
        }
      }
      launch{
        repeat(100){
          delay(80.milliseconds)
          println("Worker C: step $it ")
        }
      }
      
      
      
    }
    delay(500.milliseconds)
    
    println("\n ----- Parant cancel ho raha hai ====")
    
    parantJob.cancelAndJoin()
    println("Sab kaam band ho gaya !!")
  }
}