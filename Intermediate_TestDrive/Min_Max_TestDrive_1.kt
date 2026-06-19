fun maxOf(a:Int,b:Int):Int{
  if (a > b) {
   return a   
  } else {
   return b 
  }
}
fun minOf(a:Int,b:Int) = if(a < b) a else b
fun main() {
    println("max of 23 and 42 is ${maxOf(23,45)}")
    println("min of 4 and 5 is ${minOf(4,5)}")
    
}