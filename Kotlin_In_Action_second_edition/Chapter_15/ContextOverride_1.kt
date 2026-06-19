import kotlinx.coroutines.*
fun main() = runBlocking(Dispatchers.Default){
  
  println("Level 1 = Thread : ${Thread.currentThread().name} , "+ "Name : ${coroutineContext[CoroutineName]?.name ?: "none"}")
  
  launch{
    println("Level 2 - Thread : ${Thread.currentThread().name} , "+"Name : ${coroutineContext[CoroutineName]?.name ?: "none" }")
    
    launch(Dispatchers.IO + CoroutineName("SpecialChild")){
      
      
      println("Level 3 - Thread : ${Thread.currentThread().name} , "+ " Name : ${coroutineContext[CoroutineName]?.name}")
    }
  }
  delay(500)
}