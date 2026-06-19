fun List<Int>.increments(): List<Int> {
  val originalList = this
  return buildList {
    for(n in originalList) add(n+1)
  }
}
fun main() {
    val originalList = listOf(1,2,3,4)
    val newList = originalList.increments()
    println(newList)
}