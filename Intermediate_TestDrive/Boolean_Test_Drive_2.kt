val Int.isEven : Boolean
  get() = this % 2 == 0
  
val Double.inRupees: String
    get() = "¢${"%.2f".format(this)}"

val Int.factorial: Long 
     get() = (1.. this).fold(1L){acc,n -> acc * n}
     

fun main() {
    println(4.isEven)
    println(7.isEven)
    println(5499.0.inRupees)
    println(5.factorial)
}