data class Product(val name: String? , val price: Double?)
fun main() {
    val products = listOf(
    Product("Pen",10.0),
    Product(null,20.0),
    Product("Book",null)
    
    )
    
    for(product in products){
      println("${product.name ?: "No Name"} -> ${product.price ?: 0.0}")
    }
}