fun calculater(operation: (operandA:Int,operandB:Int) -> Int):Int {
  return operation(20,8)
}
fun main(){
  println(calculater{op,op1 -> op*op1})
  println(calculater{a,b -> a-b})
  println(calculater{a,b -> a+b})
  println(calculater{a,b -> a%b})
  println(calculater{a,b -> a/b})
}