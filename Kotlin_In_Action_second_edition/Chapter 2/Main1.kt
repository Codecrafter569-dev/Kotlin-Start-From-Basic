fun main() {
    println("Hello World")
    val name: String = "Vikash Kumar"
    println(name)
    println("Max is 12 and 56 :${max(12,56)}")
    println("Is Posible to performed :${canPerformed(1)}")
    val t1 : Boolean = canPerformed(1)
    
    if (t1) {
       println("Action Performed.") 
    } else {
        println("Action not Performed.")
    }
    val l1 = Rectangle(12,12)
    println(l1.isSquare)
    val l2 = Rectangle(20,22)
    println(l2.isSquare)
}
fun max(a : Int,b: Int): Int{
  return if( a > b) a else b
}

class Rectangle(val height: Int,val width: Int){
  val isSquare : Boolean
      get() = height == width
}
fun canPerformed(isTrue: Int) = if(isTrue == 1) true else false