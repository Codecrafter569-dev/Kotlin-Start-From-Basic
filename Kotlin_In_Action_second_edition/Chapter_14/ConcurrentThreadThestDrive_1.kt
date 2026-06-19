import kotlin.concurrent.thread
fun main(){
  println("Main Thread : ${Thread.currentThread().name}")
  
  thread{
    println("thread 1 start :${Thread.currentThread().name}")
    Thread.sleep(100)
    println("Thread -1 done")
  }
  thread{
    println("Thread 2 start : ${Thread.currentThread().name}")
    Thread.sleep(100)
    println("Thread 2 is done...")
  }
  Thread.sleep(500)
  println("The Main Thread was Done ....")
}