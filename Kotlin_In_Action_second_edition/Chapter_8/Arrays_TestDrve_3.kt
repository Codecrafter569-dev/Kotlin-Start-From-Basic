fun main(){
  val score = IntArray(10){ it * 100}
  val bonuses = DoubleArray(10){ it * 2.5 }
  val passed = BooleanArray(10){ it % 2 == 0 }
  
  println(score.joinToString())
  println(bonuses.joinToString())
  println(passed.joinToString())
}