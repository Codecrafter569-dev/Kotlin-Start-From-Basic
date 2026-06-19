open class Account(val name: String){
  fun info(){
    println("Account Holder Name:$name")
  }
}
class SavingAccount(name: String,val interestRate: Int): Account(name)
fun main() {
    val v1 = Account("Vikash Kumar",)
    v1.info()
    val v2 = SavingAccount("Anmol Kumar",4)
    v2.info()
    println("InterestRate :${v2.interestRate}")
}