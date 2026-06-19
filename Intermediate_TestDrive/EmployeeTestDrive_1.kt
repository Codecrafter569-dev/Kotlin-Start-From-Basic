open class Employee(val name: String)
interface Workable {
    fun work()
}
class Developer(name: String): Employee(name), Workable {
  override fun work(){
    println("$name is coding")
  }
}
fun main() {
    val d = Developer("Neha")
    d.work()
}