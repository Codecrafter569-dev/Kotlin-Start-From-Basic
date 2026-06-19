fun validataStock(requested: Int?,available: Int?): Int{
  val validRequested = requested ?: return -1
  val validAvalable = available ?: return -1
  
  if (validRequested < 0) {
      return -1;
  }
  if (validRequested > validAvalable) {
      return -1;
  }
  return validRequested
}
fun main() {
    println(validataStock(5,10))
    println(validataStock(34,90))
    println(validataStock(null,1))
    println(validataStock(-1,-3))
}