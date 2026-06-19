interface Flyable {
    fun fly( model: String)
    fun crash( speed: Int)
}
class Airplane: Flyable{
  override fun fly(model: String){
    println("The Airplane Model: $model is now ready to fly")
  }
  override fun crash(speed: Int){
    println("The Airplane is take a speed: $speed km/h to crash.")
  }
}
fun main() {
    val air1 = Airplane()
    air1.fly("XQ2000")
    air1.crash(3000)
}