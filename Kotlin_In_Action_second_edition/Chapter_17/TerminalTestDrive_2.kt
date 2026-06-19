import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
fun numbers() = flow{
  emit(10)
  emit(20)
  emit(30)
  emit(40)
  emit(50)
}
fun main(): Unit = runBlocking{
  println("---- Using collect with lambda -----")
  numbers().collect{ values -> println("Received : $values")
  }
  
  println("\n--- Using onEach + collect() — exactly the same behavior ---")
  
  numbers().onEach{ values  ->
    println("Received : $values")
  }.collect()
}