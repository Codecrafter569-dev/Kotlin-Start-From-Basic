import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

class BankAccount(private var balance: Double){
  private val lock = ReentrantLock()
  
  fun deposit(amount : Double){
    lock.withLock{
      balance += amount
      println("Deposited $amount . Balance : $balance")
    }
    }
    fun withdraw(amount:Double){
      lock.withLock{
        if(balance >= amount){
          balance -= amount
          println("Withdrew $amount . Balance : $balance")
        }else{
          println("Insufficient funds . Balance : $balance")
        }
      }
    }
  
}
fun main(){
  val account = BankAccount(1000.0)
  account.deposit(500.0)
  account.withdraw(200.0)
  account.withdraw(2000.0)
  account.deposit(5000.0)
  account.withdraw(2000.0)
}