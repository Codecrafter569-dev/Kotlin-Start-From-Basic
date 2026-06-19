data class ProductInfo(val priceInDollars: Double?)

class Product{
  fun getProductInfo(): ProductInfo?{
    return ProductInfo(100.0)
  }
}
fun Product.getProductInEuros() = getProductInfo()?.priceInDollars?.let{convertToEuros(it)}

fun convertToEuros(dollars: Double): Double {
  return dollars * 0.85
}
fun main() {
    val product = Product()
    val priceInEuros = product.getProductInEuros()
    
    if (priceInEuros != null) {
        println("Price in Euros: €$priceInEuros")
    } else {
        println("Price is not available.")
    }
}