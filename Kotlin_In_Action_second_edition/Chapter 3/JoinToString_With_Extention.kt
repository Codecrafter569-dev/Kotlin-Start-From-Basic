fun <T> Collection<T>.joinToString(
separator: String = ",",
prefix: String = "",
postfix: String =""
): String{
  val result = StringBuilder(prefix)
  for((index,element) in this.withIndex()){
    if (index > 0) {
        result.append(separator)
    }
    result.append(element)
    
  }
  result.append(postfix)
  return result.toString()
}
fun main() {
    val list1 = listOf(1,2,3,4,5,7,6)
    println(list1.joinToString())
    println(list1.joinToString(" . ","[",")"))
    println("Vikash Kumar".lastChar())
    println("Vikash".lastChar1())
    println(list1.lastElements())
}
fun String.lastChar1(): Char = get(length - 1)
fun String.lastChar(): Char = this[this.length-1]
fun <T> Collection<T>.lastElements(): T {
  return this.last();
}