data class Product(val name: String,val price: Double,val category: String)
val products = listOf(
Product("Laptop",999.9,"Electronics"),
Product("Phone",599.9,"Electronics"),
Product("Shirt",899.9,"Clothings"),
Product("Shoes",123.99,"Clothings"),
Product("Book",1888.9,"Education")
)

fun  List<Product>.averageElectronicsPrice(): Double = this.filter{it.category == "Electronics"}
  .map{it.price}
  .average()
  
fun List<Product>.averagePowerTest(predicate: (Product) -> Boolean): Double {
  return filter(predicate).map{it.price}.average()
}
fun main(){
  println(products.averageElectronicsPrice())
  
  println(products.averagePowerTest({it.price < 1000}))
  println(products.averagePowerTest({it.category == "Clothings"}))
  
}