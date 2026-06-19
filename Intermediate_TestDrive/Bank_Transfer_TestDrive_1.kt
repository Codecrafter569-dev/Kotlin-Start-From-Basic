@JvmInline
value class Rupees(val amount: Double){
  operator fun plus(other: Rupees) = Rupees(amount+other.amount)
  fun display() = "¢${"%.2f".format(amount)}"
}
fun transfer(from: String,to: String,amount: Rupees) {
  println(" Transferring ${amount.display()} from $from to $to")
}
fun main() {
    val myMoney = Rupees(5000.0)
    val bonus = Rupees(1500.0)
    val total = myMoney+bonus
    println(total.plus(Rupees(2000.0)))
    println("Total balance: ${total.display()}")
    transfer("Vikash","Saving A/C",Rupees(3000.0))
}