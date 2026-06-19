fun main(){
  val sum: (Int,Int) -> Int = { a,b -> a+b}
  println(sum(23,90))
  val p : () -> Unit = { println("Hello,World!!!") }
  p()
  
  check(10){it > 5 }
  
  val numbers = listOf(1,2,3,4,56,9,7)
  val squared = numbers.map{it*it}
  println(squared)
  
  println(greet("Vikash Kumar"))
}
val greet: (String) -> String = { "Hello, $it"}
fun check(n:Int, condition : (Int) -> Boolean){
  println(condition(n))
}