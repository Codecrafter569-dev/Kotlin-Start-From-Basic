interface Exper {
    
}
class Num(val value: Int): Exper
class Sum(val right: Exper,val left: Exper): Exper
fun eval(e: Exper): Int =
    when(e){
      is Num  -> {
        println("num: ${e.value}")
        e.value
      }
      
      is Sum ->{
        val left = eval(e.left)
        val right = eval(e.right)
        println("sum : $left + $right")
        left + right
      }
      else -> 0
    }
fun main() {
    println(eval(Sum(Num(23),Num(78))))
}