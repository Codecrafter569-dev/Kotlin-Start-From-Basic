data class Product(val name: String, val price: Double?)

fun parseProducts(csv: String) : List<Product> {
  return csv.lines()
  .drop(1)
  .filter{it.isNotBlank() }
  .map{ line ->
  val parts  = line.split(",")
  val name = parts[0].trim()
  val price = parts[1].trim().toDoubleOrNull()
  
  Product(name,price)
  }
}
fun main(){
  val csv = """
        name,price
        Laptop,999.99
        Phone,invalid
        Tablet,499.00
        Headphones,
    """.trimIndent()

val products = parseProducts(csv)
products.forEach{ println(it)}


val validProducts  = products.filter{ it.price != null }
println(validProducts)

}