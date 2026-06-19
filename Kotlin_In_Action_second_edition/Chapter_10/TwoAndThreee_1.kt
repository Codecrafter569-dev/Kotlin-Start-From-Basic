fun twoAndThree(operation:(Int,Int) -> Int){
  val result = operation(34,90)
  println("The result is :$result")
}
fun main(){
  twoAndThree{a,b -> a-b}
  twoAndThree{a,b -> a*b}
  twoAndThree{a,b -> a%b}
  twoAndThree{a,b -> a+b}
  twoAndThree{a,b -> maxOf(a,b) }
}