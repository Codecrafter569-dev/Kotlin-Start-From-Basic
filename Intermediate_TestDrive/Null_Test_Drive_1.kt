fun pareInt(str: String): Int?{
  return str.toIntOrNull()
}
fun printProduct(args1: String,args2: String){
  val x = pareInt(args1)
  val y = pareInt(args2)
  
  if (x != null && y != null) {
      println(x*y)
  }else{
    println("'$args1' or '$args2' is not a number .")
  }
}
fun main() {
    printProduct("9","9")
    printProduct("7","5")
    printProduct("a","b")
    printProduct("10","l")
}