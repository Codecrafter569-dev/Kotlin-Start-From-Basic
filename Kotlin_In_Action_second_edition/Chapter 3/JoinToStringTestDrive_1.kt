fun <T> joinToString(
collection: Collection<T>,
separator: String,
prefix: String,
postfix: String
): String{
  val result = StringBuilder(prefix)
  for((index,elements) in collection.withIndex()){
    if (index > 0) {
        result.append(separator)
    }
    result.append(elements)
    
  }
  result.append(postfix)
  return result.toString()
}
fun main() {
    val list = listOf(1,2,3,4,5)
    println(joinToString(list,",","#","#"))
    println(joinToString(list,"; ","(",")"))
}