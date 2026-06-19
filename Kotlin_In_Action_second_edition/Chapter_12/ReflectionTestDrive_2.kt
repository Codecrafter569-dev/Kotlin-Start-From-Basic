
import kotlin.reflect.full.*
class MathUnits{
  fun square(n:Int) = n*n
  fun cube(n:Int) = n*n*n
  fun isEven(n:Int) = n % 2 == 0
}
fun main(){
  val instance = MathUnits()
  val kClass = instance::class
  
  println("All callable memebers of MathUnits: \n")
  
  kClass.memberFunctions.forEach{
    fn -> 
    println("Function : ${fn.name}")
    println("Parameters : ${fn.parameters.map{it.name}} ")
    println("Return type : ${fn.returnType}")
    
    if (fn.name in listOf("square","cube","isEven")) {
      val result = fn.call(instance,20)
      println("Result(4) : $result")
    } 
    println()
  }
  
}