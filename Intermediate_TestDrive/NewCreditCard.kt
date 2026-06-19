interface Refundable {
    fun refund(amount: Double)
}
abstract class PaymentMethod(val name: String){
  fun authorize(amount: Double){
    println("Authorizing payment of $amount")
  }
  abstract fun processPayment(amount: Double)
}
class CraditCard(name: String): PaymentMethod(name), Refundable{
  override fun processPayment(amount: Double){
    println("Processing credit card payment of $amount")
  }
  override fun refund(amount: Double){
    println("Refunding $$amount to the credit card.")
  }
}
fun main() {
  val visa = CraditCard("Visa")  
  
  visa.authorize(200.0)
  visa.processPayment(200.9)
  visa.refund(200.90)
}