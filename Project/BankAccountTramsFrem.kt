fun main() {
    var balance = 1000.0
    
    fun formatMoney(amount: Double) = "$${"%.2f".format(amount)}"
    fun isValidAmount(amount : Double) = amount > 0 && amount <= balance
    
    fun deposit(amount: Double,note: String = "General Deposit"){
      if (amount <= 0) {
          println("Invalid deposit");
          return
      }
      balance += amount
      println(" Deposited ${formatMoney(amount)}  | $note | Balance : ${formatMoney(balance)}")
    }
    fun withdraw(amount: Double): Boolean {
      return if (isValidAmount(amount)) {
          balance -= amount
          println(" Withdrew ${formatMoney(amount)} | Balance: ${formatMoney(balance)}")
          true
      }else {
        println("Insufficient funds or invalid amount")
        false
      }
    }
    fun batchDeposit(vararg amounts: Double){
      println("\n Batch Deposit :")
      amounts.forEach{ deposit(it)}
    }
    
    fun printStatement(accountHolder: String,accoutType: String = "Savings"){
        println("""
            ┌─────────────────────────────┐
            │  Account: $accountHolder
            │  Type   : $accoutType
            │  Balance: ${formatMoney(balance)}
            └─────────────────────────────┘
        """.trimIndent())
    }
    
    printStatement("Emily Center")
    deposit(500.0,"Salary")
    deposit(200.0)
    deposit(500.0)
    withdraw(200.0)
    withdraw(300.0)
    batchDeposit(50.0,75.0,120.0)
    printStatement("Emily Center","Premium Savings")
}