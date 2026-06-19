class SumTest private constructor(private val num1:Int,private val num2:Int){
  fun printSum(){
    println("$num1 + $num2 = ${num1 + num2} ")
  }
  
  companion object {
    fun create(num1:Int,num2:Int): SumTest{
      return SumTest(num1,num2)
    }
  }
}

fun main(){
  val b1 = SumTest.create(23,89)
  b1.printSum()
}