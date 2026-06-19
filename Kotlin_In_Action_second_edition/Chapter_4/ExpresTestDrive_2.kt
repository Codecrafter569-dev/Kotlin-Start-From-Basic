sealed class Expre
class Num(val value: Int):Expre()
class Sum(val left:Expre,val right:Expre):Expre()
fun eval(e: Expre): Int =
 when(e){
   is Num  -> e.value
   is Sum  -> eval(e.left)+eval(e.right)
 }
fun main(){
  val result = eval(Sum(Num(22),Num(80)))
  println("Result :$result")
}