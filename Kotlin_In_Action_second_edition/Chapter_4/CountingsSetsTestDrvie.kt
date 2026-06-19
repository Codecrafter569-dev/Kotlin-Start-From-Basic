class CountingSet<T>(
  private val innerSet : MutableCollection<T> = hashSetOf()
): MutableCollection<T> by innerSet {
  
  var objectAdded = 0
  override fun add(element:T):Boolean {
    objectAdded++;
    return innerSet.add(element)
  }
  override fun addAll(elements: Collection<T>): Boolean {
    objectAdded += elements.size
    return innerSet.addAll(elements)
  }
}
fun main(){
  val cst = CountingSet<Int>()
  cst.addAll(listOf(1,3,4,2,3,5,6,8,9))
  println("Added  ${cst.objectAdded} objects , ${cst.size} Uniques.")
  
  cst.add(3)
  cst.add(3)
  println(cst.contains(2))
  println(cst.contains(4))
  println(cst.contains(8))
}