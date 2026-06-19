fun Int.isEven(): Boolean {
  return this % 2 == 0
}
fun String.reverseText():String{
  return this.reversed()
}
fun main() {
    println(838.isEven())
    println(900.isEven())
    println(100.isEven())
    println(3.isEven())
    println("Bolo".reverseText())
    println("Hello".reverseText())
    
    
}