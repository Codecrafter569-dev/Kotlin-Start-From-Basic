import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
fun Flow<Double>.averageOfLast(n: Int): Flow<Double> = flow{
  val window = mutableListOf<Double>()
  
  collect{ incomeingValue ->
  if(window.size >= n){
    window.removeFirst()
    }
  
  window.add(incomeingValue)
  emit(window.average())
  }
}
fun main(): Unit = runBlocking{
  flowOf(1.0,2.0,3.0,4.5,122.93)
  .averageOfLast(3)
  .collect{ avg -> 
  println("$avg")
  }
}