interface Exper {
    
}
class Num(val value:Int): Exper
class Sum(val right: Exper,val left: Exper): Exper
fun eval(e: Exper): Int = when(e){
    is Num -> e.value
    is Sum   -> eval(e.right)+eval(e.left)
    else -> 0
}
fun main() {
    println(eval(Sum(Num(34),Num(90))))
}