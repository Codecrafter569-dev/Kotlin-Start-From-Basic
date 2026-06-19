class DelegatingCollection<T>(
private val innerList: MutableList<T> = mutableListOf()
): MutableCollection<T> by innerList
fun main(){
  val col = DelegatingCollection<Int>()
  col.add(1)
  col.add(2)
  col.add(3)
  col.add(4)
  println(col.size)
  println(col.isEmpty())
  println(col.contains(1))
  println(col.contains(3))
  println(col.contains(4))
  col.forEach {
    print("$it ")
  }
  println()
}