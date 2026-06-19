open class Vehical(val make: String,val model: String,val transmissionType: String = "Manual")
class Car(make: String,model:String,val numberOfDoors: Int): Vehical(make,model,"Autometic")
fun main() {
    val v = Vehical("Farari","X11")
    val c1 = Car("Baloro","X11_Clasic",6)
    println(v.make)
    println(v.model)
    println(v.transmissionType)
    println(c1.make)
    println(c1.model)
    println(c1.numberOfDoors)
    println(c1.transmissionType)
}