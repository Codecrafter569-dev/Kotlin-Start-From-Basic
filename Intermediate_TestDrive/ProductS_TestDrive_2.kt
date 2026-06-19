class Product(val name: String, val price: Double,val quantity: Int){
  val totalValue : Double 
      get() = price * quantity
  val isAvailable: Boolean 
      get() = quantity > 0
      
  val displayName: String 
      get() = name.uppercase()
}
fun main() {
    val p = Product("Laptop",78000.0,10)
    println("Product : ${p.displayName}")
    println("Available :${p.isAvailable}")
    println("Total Val: $${p.totalValue}")
}