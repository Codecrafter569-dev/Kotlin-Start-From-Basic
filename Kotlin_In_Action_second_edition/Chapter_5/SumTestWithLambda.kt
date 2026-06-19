fun main(){
  val sum = {x:Int , y:Int  -> x + y}
  println(sum(23,89))
  val multiply = {x:Int,y:Int  -> x*y}
  println(multiply(2,8))
  
//  val result = {39+82}()
 // println(result)
  
 // {println(77)}()
  
  run {
    println(77)
  }
}