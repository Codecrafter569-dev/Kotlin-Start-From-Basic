fun add(a : Int,b : Int) : Int{
  return a+b
}
fun areOfSquare(a : Int,b : Int) = a *b
fun primeterOfSquareIs(a:Int,b:Int): Unit{
  println("Sum of $a and $b is ${2*(a+b)}")
}
fun main() {
    print("Sum of 89 and 99 is: ")
    println(add(89,90))
    
    println("The Area of Rectagle is : ${areOfSquare(23,45)}")
    println("Perameter of Rectagle is : ${primeterOfSquareIs(20,30)}")
}