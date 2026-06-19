fun String.addwelcome(): String {
    return "Welcome $this"
}
fun Int.square(): Int{
  return this * this
}
fun String.repeatTime(n: Int): String{
  return this.repeat(n)
}
val String.lastChar: Char get() = this[this.length-1]
fun main() {
    println("Vikash".addwelcome())
    println(10.square())
    println("Hello... ".repeatTime(10))
    println("Kotlin".lastChar)
}