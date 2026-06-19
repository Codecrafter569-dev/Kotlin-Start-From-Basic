import kotlinx.coroutines.*

fun docpuHeavyWork(coroutinesName : String): Int{
  println("$coroutinesName  Starting working....")
  var counter = 0
  val start = System.currentTimeMillis()
  while(System.currentTimeMillis() < start + 500){
    counter++
  }
  println(" $coroutinesName : Done !!....")
  return counter
}
fun main(){
  runBlocking{
    launch{
      repeat(5){
        docpuHeavyWork("Coroutine - A")
      }
    }
    launch{
      repeat(5){
        docpuHeavyWork("Coroutine - B")
      }
    }
  }
}