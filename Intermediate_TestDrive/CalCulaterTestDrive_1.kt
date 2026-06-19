fun cal(items: List<Any>): Int{
  return items.sumOf{ (it as? String)?.length ?: 0}
}
fun main() {
    val list1 = listOf("Vikash","Aasis","Alok","Rahul")
    val s1 : Int = cal(list1)
    println(s1)
}