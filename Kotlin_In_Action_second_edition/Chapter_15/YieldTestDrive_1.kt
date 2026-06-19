import kotlinx.coroutines.*
suspend  fun doSomeHaveyWork(coroutinesName : String): Int{
  println("$coroutinesName : Starting work ....")
  var counter = 0
  val start = System.currentTimeMillis()
  while(System.currentTimeMillis() < start + 500){
    counter++
    yield()
  }
  println(" $coroutinesName  : Done ")
  return counter
}
fun main(){
  runBlocking{
    launch{
      repeat(3){
        doSomeHaveyWork("Coroutine - A")
      }
    }
    launch{
      repeat(3){
        doSomeHaveyWork("Coroutine - B")
      }
    }
  }
}