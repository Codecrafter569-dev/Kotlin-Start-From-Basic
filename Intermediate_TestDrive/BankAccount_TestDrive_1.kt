class BankAccount(var balance: Int){
  fun deposit(amount: Int){
    balance += amount
    println("New balance = $balance")
  }
}
fun main() {
    var acc = BankAccount(1000)
    acc.deposit(500)
    
}