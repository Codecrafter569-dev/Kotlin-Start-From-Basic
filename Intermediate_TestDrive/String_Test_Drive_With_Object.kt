object StringHelper {
  fun isEmpty(text: String): Boolean {
    return text.isEmpty()
  }
}
fun main() {
    println(StringHelper.isEmpty(""))
    println(StringHelper.isEmpty("Vikash Kumar"))
}