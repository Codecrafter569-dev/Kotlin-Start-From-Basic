fun applyTwice(value:Int,operations:(Int) -> Int):Int {
  return operations(operations(value))
}
fun main(){
  val a = applyTwice(39){ it*2}
  println(a)
  
  val doubleAndLong: (Int)  -> Int = { n -> 
  println("Input: $n")
  val result = n*2
  println("Doubled: $result")
  result
  }
  doubleAndLong(90)
}