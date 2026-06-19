import kotlin.concurrent.thread
fun main(){
  println("I'm on ${Thread.currentThread().name}")
  thread{
    println("And I'm on ${Thread.currentThread().name}")
  }
  Thread.sleep(100)
}