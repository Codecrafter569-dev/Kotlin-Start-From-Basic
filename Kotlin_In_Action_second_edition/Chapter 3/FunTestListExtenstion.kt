fun <T> List<T>.last(): T{
  return this[this.size-1]
}
fun Collection<Int>.sum(): Int{
  var result = 0
  for(num in this){
    result += num
  }
  return result
}
fun main() {
    val strings: List<String> = listOf("first","second","fourteenth")
    println(strings.last())
    val num: List<Int> = listOf(23,49,9,3,45,90,22)
    println(num.sum())
}