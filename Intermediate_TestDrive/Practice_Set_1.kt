fun findOutOfStockBooks(inventory: List<Int>): List<Int>{
  val outOfStockIndies = mutableListOf<Int>()
  for(index in inventory.indices){
  println(index)
    if(inventory[index] == 0){
      outOfStockIndies.add(index)
    }
  }
  return outOfStockIndies
}
fun main() {
    val inventory = listOf(3,0,7,0,5)
    println(findOutOfStockBooks(inventory))
}