interface EcoFriendly{
  val emissionLevel: String
}
interface ElectricVehical {
    val batteryCapacity: Double
}
open class Vehical(val make:String,val model: String)
open class Car(make: String,model:String,val numberOfDoors: Int): Vehical(make,model)

class ElectricCar(make:String,model:String,numberOfDoors:Int,val level: String,val capacity: Double): Car(make,model,numberOfDoors),EcoFriendly,ElectricVehical{
 override val emissionLevel : String  = level
 override val batteryCapacity : Double = capacity
}
fun main() {
    val e1 = ElectricCar("XuV700","X11",6,"Max",90000.00)
    
    println(e1.make)
    println(e1.model)
    println(e1.numberOfDoors)
    println(e1.emissionLevel)
    println(e1.batteryCapacity)
}