fun getDiscount(price: Double?) : Double {
  val actualPrice = price ?: return 0.0
  return actualPrice * 0.1
}
fun main() {
    println(getDiscount(500.0))
    println(getDiscount(null))
}