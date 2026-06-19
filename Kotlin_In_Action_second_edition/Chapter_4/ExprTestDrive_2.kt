interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.left) + eval(e.right)
    else    ->throw IllegalArgumentException("Unknown")
}

fun main() {
    val result = eval(Sum(Num(23), Num(78)))
    println(result)
}