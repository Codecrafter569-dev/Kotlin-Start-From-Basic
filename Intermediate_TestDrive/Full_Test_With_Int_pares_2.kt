fun parseInt(str: String): Int?{
  return str.toIntOrNull();
}
fun printProduct(args1:String,args2:String){
  val x = parseInt(args1)
  val y = parseInt(args2)
  
  if (x == null) {
     println("wrong number format in args1 : $args1") 
     return
  }
  if (y == null) {
      println("Wrong number format in args2: $args2")
      return
  }
  println(x*y)
}
fun main() {
    printProduct("12","90")
    printProduct("20","23")
    printProduct("13","88")
    printProduct("a","b")
    printProduct("A","1")
}