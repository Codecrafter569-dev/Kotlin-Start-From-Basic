//## 1. Sealed Class + Exhaustive `when` — Expression Tree //Calculator

//```kotlin
sealed class MathExpr
data class Const(val n: Double) : MathExpr()
data class Negate(val expr: MathExpr) : MathExpr()
data class Add(val a: MathExpr, val b: MathExpr) : MathExpr()
data class Multiply(val a: MathExpr, val b: MathExpr) : MathExpr()
data class Divide(val a: MathExpr, val b: MathExpr) : MathExpr()

fun eval(expr: MathExpr): Double = when (expr) {
    is Const    -> expr.n
    is Negate   -> -eval(expr.expr)
    is Add      -> eval(expr.a) + eval(expr.b)
    is Multiply -> eval(expr.a) * eval(expr.b)
    is Divide   -> {
        val divisor = eval(expr.b)
        require(divisor != 0.0) { "Division by zero" }
        eval(expr.a) / divisor
    }
}

fun prettyPrint(expr: MathExpr): String = when (expr) {
    is Const    -> expr.n.toString()
    is Negate   -> "(-${prettyPrint(expr.expr)})"
    is Add      -> "(${prettyPrint(expr.a)} + ${prettyPrint(expr.b)})"
    is Multiply -> "(${prettyPrint(expr.a)} * ${prettyPrint(expr.b)})"
    is Divide   -> "(${prettyPrint(expr.a)} / ${prettyPrint(expr.b)})"
}

fun main() {
    // Represents: ((10 + (-3)) * 2) / 7
    val expr = Divide(
        Multiply(
            Add(Const(10.0), Negate(Const(3.0))),
            Const(2.0)
        ),
        Const(7.0)
    )

    println(prettyPrint(expr))  // (((10.0 + (-3.0)) * 2.0) / 7.0)
    println(eval(expr))         // 2.0

    // Compiler error if any branch is missing — no else needed
    val simple = Add(Const(5.0), Multiply(Const(33.0), Const(4.0)))
    println("${prettyPrint(simple)} = ${eval(simple)}")  // (5.0 + (3.0 * 4.0)) = 17.0
}
