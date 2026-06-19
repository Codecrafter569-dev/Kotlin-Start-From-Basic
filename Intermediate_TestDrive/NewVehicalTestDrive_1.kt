open class Vehicle{
  fun start(){
    println("Vehicle started and you now how")
  }
}
class Car : Vehicle(){
  fun go(){
    println("The car is now go and takeing a speed.")
  }
}
fun main() {
    val car = Car()
    car.start()
    car.go()
}