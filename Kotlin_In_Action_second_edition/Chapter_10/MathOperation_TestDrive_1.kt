fun applyOperation(a:Int,b:Int, operation:(Int,Int) ->Int): Int {
  return operation(a,b)
}
fun main(){
  println(applyOperation(10,3,{a,b -> a+b}))
  println(applyOperation(20,34,{a,b -> a-b}))
  println(applyOperation(30,40,{a,b -> a*b}))
  println(applyOperation(200,2,{a,b -> a % b}))
  
  val operation: (Int,Int) -> Int = {a,b -> a*b*20*30 }
  println(applyOperation(20,40,operation))
}