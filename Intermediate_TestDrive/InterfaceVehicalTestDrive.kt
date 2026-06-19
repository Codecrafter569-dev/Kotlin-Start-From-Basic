interface Vehical {
    val name: String
    fun move(): String
}
object FlyingSketebord: Vehical {
  override val name = "Flying Sketebord"
  override fun move() = "Glides through the air with a hover engine"
  
  fun fly(): String = "Wooooooo"
}
fun main() {
    println("${FlyingSketebord.name}: ${FlyingSketebord.move()}")
    
    println("${FlyingSketebord.name} : ${FlyingSketebord.fly()}")
}