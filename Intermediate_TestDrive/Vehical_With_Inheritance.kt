open class Vehicle {
  fun start(){
    println("Vehicle is now become to start.")
  }
}
class Bike: Vehicle(){
  fun ride(){
    println("Bike is ready to Ride.")
  }
}
fun main() {
    val name1 = Bike()
    name1.start()
    name1.ride()
}