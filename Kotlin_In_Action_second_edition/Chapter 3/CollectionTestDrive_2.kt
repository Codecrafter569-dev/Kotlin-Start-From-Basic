fun <T> Collection<T>.joinToString(
separator: String = ",",
prefix: String = "",
postfix: String = "",
transform:(T) -> String = {it.toString()}
): String {
  val result = StringBuilder(prefix)
  
  for((index,elements) in this.withIndex()){
    if(index > 0) result.append(separator)
    result.append(transform(elements))
  }
  result.append(postfix)
  return result.toString()
}
fun main() {
    val list1 = listOf(1,2,4,4,5)
    println(list1.joinToString{"Number:$it"})
}
