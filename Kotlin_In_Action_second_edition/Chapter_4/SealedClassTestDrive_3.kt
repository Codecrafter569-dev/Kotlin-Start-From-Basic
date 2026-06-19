sealed class Expr
class Num(val value:Int):Expr()
class Sum(val left:Expr,val right:Expr): Expr()
class Multi(val left:Expr,val right:Expr): Expr()

fun eval(e: Expr): Int = when(e){
  is Num -> e.value
  is Sum  -> eval(e.left)+eval(e.right)
  is Multi -> eval(e.left)+eval(e.right)
}
fun main(){
  val result = eval(Sum(Num(44),Num(67)))
  val r1 = eval(Multi(Num(33),Num(89)))
  println(result)
  println(r1)
}