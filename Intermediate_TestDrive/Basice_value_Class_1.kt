@JvmInline
value class Username(val name: String)
fun greet(user: Username){
  println("Hello, ${user.name}!")
}
fun main() {
    val s1 = Username("Vikash Kumar")
    greet(s1)
}