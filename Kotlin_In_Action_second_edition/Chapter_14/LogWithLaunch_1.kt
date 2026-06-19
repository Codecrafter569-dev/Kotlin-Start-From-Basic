import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

private var zeroTime =  System.currentTimeMillis()
fun log(message : Any?)  = println("${System.currentTimeMillis() - zeroTime}ms "+"${Thread.currentThread().name}  $message ")



fun main()  = runBlocking{
  log("The first , parent , coroutine starts")
  
  launch{
    log("The second coroutine starts and is ready to be suspend")
    delay(100.milliseconds)
    log("The second coroutine is resumed...")
  }
  
  launch{
    log("The third coroutine can run in the meantime")
  }
  log("The first coroutine has launched two more coroutine..")
}