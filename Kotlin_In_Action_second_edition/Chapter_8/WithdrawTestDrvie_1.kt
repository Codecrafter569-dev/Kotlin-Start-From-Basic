fun withdraw(balance : Double , amount : Double) : Double {
  val safeAmount = amount.coerceIn(0.0,balance)
  
  println("withdrawing : $safeAmount from balance $balance")
  
  return balance - safeAmount
}
fun main(){
  println("Remaining: ${withdraw(500.0,200.0)}")
  println("Remaining : ${withdraw(600.0,300.0)}")
  println("Remaining : ${withdraw(400.0,500.0)}")
}