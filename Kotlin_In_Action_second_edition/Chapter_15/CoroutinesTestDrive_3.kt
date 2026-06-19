import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

fun main(){
  runBlocking{
    println("Boss was completed owen work....")
    
    launch{
      delay(500.milliseconds)
      println("The worker 1 was completed owen work....")
    }
    launch{
      delay(300.milliseconds)
      println("The worker 2 was completed owen work ....")
    }
    launch{
      delay(200.milliseconds)
      println(" The worker 3 was completed owen work ...")
    }
    println("Boss was completed fully work ...")
  }
  println("All work was done and program was exit...")
}