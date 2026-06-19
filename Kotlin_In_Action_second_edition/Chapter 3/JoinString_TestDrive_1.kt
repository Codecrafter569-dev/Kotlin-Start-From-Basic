fun <T> Collection<T>.joinToString(
separator: String=",",
prefix: String = "",
postfix: String = ""
): String {
  val result = StringBuilder(prefix)
  for((index,element) in this.withIndex()){
    if(index > 0) result.append(separator)
    result.append(element)
  }
  result.append(postfix)
  return result.toString()
}
fun Collection<String>.join(
separator: String =",",
prefix: String = "",
postfix: String =""
): String {
  return this.joinToString(separator,prefix,postfix)
}
fun main() {
    val list1 = listOf("one","two","eight")
    println(list1.join())
}