class StringUtils {
  fun countWords(text: String): Int {
    return text.split(" ").size
  }
}
fun String.countWords():Int {
  return this.split(" ").size
}

fun List<Int>.averageNumber(): Double {
    return this.sum().toDouble()/this.size
}
fun main() {
    println("I Love kotlin :".countWords())
    val name = StringUtils()
    println(name.countWords("Hello bro kya"))
    val num = listOf(10,20,30,50,90)
    println("The average of this list :${num.averageNumber()}")
}