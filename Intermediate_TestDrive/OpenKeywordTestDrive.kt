open class Vehical(val make: String,val model: String)
class Car(make: String,model: String,val numberOfDors: Int): Vehical(make,model)

fun main() {
    val ve = Vehical("Fortuner","X430")
    val car = Car("Toyota","Corolla",6)
    println(ve.make)
    println(ve.model)
    println("Car Make - ${car.make}")
    println("Car model - ${car.model}")
    println("Car numberOfDors - ${car.numberOfDors}")
}