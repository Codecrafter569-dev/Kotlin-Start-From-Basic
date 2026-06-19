fun interface IntCondition {
  fun check(i:Int) : Boolean 
  
  fun checkString(s: String) = check(s.toInt())
  
  fun checkChar(c: Char) = check(c.digitToInt())
}
fun main(){
  val isOdd = IntCondition { it % 2 != 0 }
  
  println(isOdd.check(23))
  println(isOdd.check(22))
  println(isOdd.checkString("3"))
  println(isOdd.checkString("4"))
  println(isOdd.checkChar('3'))
  println(isOdd.checkChar('4'))
  
  val isPositive = IntCondition{it > 0 }
  println(isPositive.check(-1))
  println(isPositive.checkString("7"))
  
  
}