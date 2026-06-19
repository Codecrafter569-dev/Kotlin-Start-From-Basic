interface JSONFactory<T> {
  fun fromJSON(jsonText: String): T
}
class Product(val name: String){
  companion object : JSONFactory<Product>{
    override fun fromJSON(jsonText : String): Product{
    val name = jsonText.substringAfter("\"name\": \"").substringBefore("\"")
      return Product(name)
    }
  }
}
fun main(){
  val product = Product.fromJSON("""{"name": "Laptop"}""")
  println(product.name)
}