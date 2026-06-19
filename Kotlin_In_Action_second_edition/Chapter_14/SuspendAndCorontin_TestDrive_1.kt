import kotlinx.coroutines.*

fun blockingVersion(){
  println("Step 1 : Login...")
  Thread.sleep(1000)
  println("Step 2 : Load data")
  Thread.sleep(1000)
  Thread.sleep(1000)
  println("Step 3 : Show data")
}
suspend fun suspendVersion(){
  println("Load...")
  delay(1000)
  println(" data load ...")
  delay(1000)
  println(" Show data")
  
}
fun main()=  runBlocking{
  println("----- suspend suspendVersion  =-----")
  suspendVersion()
  println("------ Normal Version ------")
  blockingVersion()
  
}