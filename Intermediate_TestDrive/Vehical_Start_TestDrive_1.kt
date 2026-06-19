open class Vehical {
  fun start(){
    println("Vehical started")
  }
}
interface Drivable {
    fun drive()
}
class Car : Vehical(), Drivable {
  override fun drive(){
    println("Car is driving")
  }
}
fun main() {
   val c1 =  Car()
   c1.start()
   c1.drive()
}