fun <T>joinToString(
collection: Collection<T>,
separator : String = ",",
prefix : String = " ",
postfix : String = " "
): String {
  val result = StringBuilder(prefix)
  for((index,element) in collection.withIndex()){
    if(index > 0) result.append(separator)
    result.append(element)
  }
  result.append(postfix)
  return result.toString()
}
fun main() {
 val set1 = setOf(1,2,3,4,5,6,8,8)
    println(joinToString(set1))
    println(joinToString(set1,":"))
    println(joinToString(set1,prefix="$",postfix="@"))
}