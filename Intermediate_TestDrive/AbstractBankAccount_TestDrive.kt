abstract class BankAccount{
  abstract fun withdraw(amount: Int)
  
  fun showBank(){
    println("This is a bank account")
  }
}

class ShavingBank : BankAccount(){
  override fun withdraw(amount: Int){
    println("withdraw Rs. $amount")
  }
}
 fun main() {
     val c1 = ShavingBank()
     c1.showBank()
     c1.withdraw(1000)
 }