interface Payment {
    fun pay(amount: Double)
}
class UpiPayment : Payment {
  override fun pay(amount: Double){
    println("Using uip a person paid Rs. $amount")
  }
}
class Shop(val pay: UpiPayment): Payment by pay

fun main() {
    val p = Shop(UpiPayment())
    p.pay(8393.39)
}