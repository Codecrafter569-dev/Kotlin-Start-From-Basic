class BankAccount {
  var balance : Double = 0.0
  private set 
  var accountHolder: String = ""
  set(value){
    field = value.trim().uppercase()
  }
  fun deposit(amount: Double){
    if (amount > 0) {
        balance += amount
    }
  }
}
fun main() {
    val acc = BankAccount()
    acc.accountHolder = "  Vikash  "
    acc.deposit(5000.0)
    
    
    println("Holder: ${acc.accountHolder}")
    println("Balance: ${acc.balance}")
}