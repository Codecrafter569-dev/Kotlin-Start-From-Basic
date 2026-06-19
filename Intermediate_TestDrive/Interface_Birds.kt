interface Flayable {
    fun fly()
}
class Birds(val name: String): Flayable{
  override fun fly(){
    println("$name is flying.")
  }
}
fun main() {
    val b1 = Birds("Parrot")
    b1.fly()
}