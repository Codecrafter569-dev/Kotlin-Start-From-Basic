data class ProductInfo(val princeInDollars: Double?)

class Product{
  fun getProductInfo(): ProductInfo? {
    return ProductInfo(100.0)
  }
}

fun Product.getProductInEuros(): Double? {
  val info = getProductInfo()
  if( info == null) return null
  val price = info.princeInDollars
  if(price == null) return null
  return convertToEuros(price)
}

fun convertToEuros(dollars: Double): Double {
  return dollars * 0.85
}
fun main() {
    val product = Product()
    val princeInEuros = product.getProductInEuros()
    
    
    if (princeInEuros != null) {
        println("Price in Euros:$princeInEuros ")
    } else {
        println("Price information is not available.")
    }
}