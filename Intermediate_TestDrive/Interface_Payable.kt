interface Payable {
    fun pay(amount: Int)
}
class UpiPayment: Payable{
  override fun pay(amount: Int){
    println("Paid Rs.$amount using UPI.")
  }
}
fun main() {
   val up = UpiPayment()
   up.pay(700)
}