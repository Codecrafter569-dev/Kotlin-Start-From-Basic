interface PaymentMethod {
    fun initiatePayment(amount: Double): String
    
}
interface PaymentType {
    val paymentType: String
}
class CreditCardPayment(val cardNumber: String, val cardHolderName: String , val expriyDate: String): PaymentMethod, PaymentType{
  override fun initiatePayment(amount: Double): String{
    return "Payment of $amount initiated using Credit Card ending in ${cardNumber.takeLast(4)}"
  }
  override val paymentType: String = "Credit Card"
}
fun main() {
    val paymentMethod = CreditCardPayment("1234 5678 9012 3456","john Doe","12/26")
    println(paymentMethod.initiatePayment(100.0))
    println(paymentMethod.paymentType)
}