open class Vehical(val make: String,val model: String){
  open fun displayInfo(){
    println("Vehical Info: Make-$make, Model - $model")
  }
}
class Car(make: String,model:String,val numnerOfDoors: Int): Vehical(make,model){
  override fun displayInfo(){
    println("Car Info: Make - $make, Model - $model , numner Of Doors : $numnerOfDoors")
  }
}
fun main() {
val ve1 = Vehical("Baloro","X200")
    val car1 = Car("Tokey","Corolla",4)
    val car2 = Car("Honda","Civis",2)
    
    println(ve1.displayInfo())
    println(car1.displayInfo())
    println(car2.displayInfo())
}