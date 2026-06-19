fun interface  IntCondition{
  fun check(i: Int) : Boolean
  fun checkString(s:String) = check(s.toInt())
  fun checkChar(c:Char) = check(c.digitToInt())
} 

fun checkCondition(i:Int, condition: IntCondition): Boolean {
  return condition.check(i)
}
fun main(){
  val result1 = checkCondition(2){ it % 2 != 0 }
  println(result1)
  val result2 = checkCondition(1){ it % 2 != 0 }
  println(result2)
  
  val idOdd: (Int) -> Boolean = {it % 2 != 0 }
  val result3 = checkCondition(1,idOdd)
  val result4 = checkCondition(3,idOdd)
  
  println(result4)
  println(result3)
  
  val isOddCondition = IntCondition { it % 2 != 0 }
  println(isOddCondition.checkString("10"))
  println(isOddCondition.checkChar('7'))
}