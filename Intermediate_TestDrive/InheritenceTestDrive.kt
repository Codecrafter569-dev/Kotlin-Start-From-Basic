class Car(val make:String, val model: String, val numberOfDors: Int)
//abstract fun makeSound()
//abstract val sound: String

abstract class Product(val name: String, var price: Double){
  abstract val category: String
  
  fun productInfo(): String {
      return "Product: $name, Categroy: $category , price: $price"
  }
}

class Electornic(name: String , price: Double , val warranty: Int) : Product(name,price){
  override val category = "Electornic"
}
fun main() {
    val car1 = Car("Toyota","Corolla",8)
    println("Car1: make=${car1.make}, model=${car1.model}, numberOfDors =${car1.numberOfDors}")
    
    val laptop = Electornic(name = "Laptop", price = 1000.0,warranty = 2)
    
    println(laptop.productInfo())
}