open class Account(val holder: String)
class SavingAccount(holder: String): Account(holder)
fun main() {
   val p1 = SavingAccount("Vikash Kumar")
   println(p1.holder)
}