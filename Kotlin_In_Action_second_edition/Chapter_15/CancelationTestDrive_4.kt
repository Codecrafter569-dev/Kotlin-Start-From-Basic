import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds
import kotlin.time.Duration.Companion.milliseconds
suspend fun dowork(){
  delay(500.milliseconds)
  throw UnsupportedOperationException("Kaam nahi chala!")
}

fun wrongWay() = runBlocking{
  withTimeoutOrNull(2.seconds){
  while(true){
    try{
      dowork()
    }catch(e : Exception){
      println("Opps (Worng) : ${e.message}")
    }
  }
  }
  println("Done .....")
}

fun correctWay() = runBlocking{
  withTimeoutOrNull(2.seconds){
    while(true){
      try {
        dowork()
      } catch (e: UnsupportedOperationException) {
        //e.printStackTrace()
        
        println("Excepted error was handle :${e.message} ")
      }
    }
    println("Done (Correct) ---- timeout ka baad yahan pahunche....")
  }
}
fun main(){
  println("==== Correct Way ====")
  correctWay()
}