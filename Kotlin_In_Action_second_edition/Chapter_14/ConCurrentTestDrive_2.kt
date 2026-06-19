import kotlin.concurrent.thread
fun main(){
  println("Boss (main) : start the work please...")
  
  val t1 = thread {
    Thread.sleep(200)
    println("ok sir my work was completed.. ${Thread.currentThread().name}")
  }
  val t2 = thread{
    Thread.sleep(100)
    println(" yes sir i am a second worker my work was fineesed... ${Thread.currentThread().name}")
  }
  t1.join()
  t2.join()
  
  println("The all work was finesed....")
}