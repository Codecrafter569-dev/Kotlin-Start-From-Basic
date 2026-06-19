import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class ParseException(message : String): Exception(message)

fun main():Unit = runBlocking{
  val rawDataFlow = flow{
    emit("93")
    emit("100")
    emit("not_a_numbers")
    emit("77")
  }
  
  println("===== With catch AFTER the failing operator (correct) ======")
  
  rawDataFlow.map{ rawString ->
    rawString.toIntOrNull() ?: throw ParseException("Cannot parse : '$rawString' ")
    
  }.catch{ e ->
    println("Caught upstream exception : ${e.message}")
    emit(-9929)
  }.collect{
    println("parse : $it")
  }
}