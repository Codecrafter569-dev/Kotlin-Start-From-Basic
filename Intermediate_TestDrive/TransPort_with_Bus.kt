abstract class Transport{
  abstract fun move()
  abstract fun speed()
}
class Bus(val busName: String): Transport(){
  override fun move(){
    println("$busName bus is Moving now.")
  }
  override fun speed(){
    println("$busName bus is take a speed.")
  }
}
fun main() {
    val bus1 = Bus("Bholbo")
    bus1.move()
    bus1.speed()
}