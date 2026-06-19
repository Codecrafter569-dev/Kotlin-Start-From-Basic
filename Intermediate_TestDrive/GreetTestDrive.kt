val greet: (String) -> String = { name -> "Hello $name"}
fun main() {
    println(greet("Vikash"))
    
    go()
}
val greet1: String.() -> String = {
  "Hello $this"
}
val lengthFun: String.() -> Int = {
  length
}

fun operator(block: Int.() -> Int): Int{
  return 5.block()
}
fun go(){
  println("Parwati Devi".greet1())
  println("Hello".lengthFun())
  
  val result = operator {
    this * 2
  }
  println(result)
  
  
}