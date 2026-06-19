interface  Exper{
    
}
class Num(val value: Int): Exper
class Sum(val right: Exper,val left: Exper): Exper
fun eval(e : Exper): Int{
  if (e is Num) {
     return e.value
  } else if(e is Sum){
      return eval(e.right)+eval(e.left);
  }else{
    return 0
  }
}
fun main() {
   println("The sum of two tree is :${eval(Sum(Num(1),Num(3)))}") 
}