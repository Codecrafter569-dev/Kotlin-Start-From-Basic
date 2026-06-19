class MathHelper{
  companion object {
    const val PI = 3.141159
    
    fun square(number: Int): Int{
      return number * number
    }
  }
}
fun main(){
  println(MathHelper.PI)
  println(MathHelper.square(28))
}