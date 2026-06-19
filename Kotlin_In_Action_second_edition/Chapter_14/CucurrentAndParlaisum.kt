
import kotlin.concurrent.thread
fun main(){
  println("==== concurrent ====")
  println("Please make a tea ...")
  println(" and at the same time read a email Please")
  println("Complete a tea making Please....")
  
  val t1 = thread{println("Person 1 : Makeing a tea")}
  val t2 = thread{println("Person 2 : reading a email please")}
  
  t1.join()
  t2.join()
  
  println("this to work was done at the same time ..")
}