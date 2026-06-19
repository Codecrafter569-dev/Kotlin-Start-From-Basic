import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds
fun main(){
  runBlocking{
    
    val job = launch{
      launch{
        launch{
          launch{
            println("Grand - grandchild was started....")
            delay(500.milliseconds)
            println("Grand- grandchild was done...")
          }
        }
      }
    }
    delay(200.milliseconds)
    
    job.cancel()
    println("When we are canceling a parant the all child and subchild was cancel...")
  }
}