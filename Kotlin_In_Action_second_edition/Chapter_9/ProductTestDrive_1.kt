data class Product(val name: String,val price: Double): Comparable<Product> {
  override fun compareTo(other: Product): Int = 
           compareValuesBy(this,other,{it.price},{it.name})
}

fun main(){
  val products = listOf(
  Product("Tablet",599.0),
  Product("Laptop",499.0),
  Product("Phone",300.0),
  Product("HeadPhones",2000.0)
  )
  
  println(" ==== By Price ==== ")
  products.sorted().forEach{ println("${it.name} : ${it.price}") }
  
 println("Cheapset: ${products.min()}")
  println("Priciest: ${products.max()}")
  
}