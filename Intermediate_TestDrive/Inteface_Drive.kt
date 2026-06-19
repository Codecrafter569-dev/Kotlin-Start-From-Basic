interface Drive {
    fun drive()
}
class Car: Drive{
  override fun drive(){
    println("Car is Driveing.")
  }
}
fun main() {
  val car = Car()
  car.drive()
}