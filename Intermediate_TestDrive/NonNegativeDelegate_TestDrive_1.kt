import kotlin.reflect.KProperty

class NonNegativeDelegate(private var value: Double =0.0){
  operator fun getValue(thisRef: Any?,property: KProperty<*>) = value
  operator fun setValue(thisRef: Any?,property: KProperty<*>, newValue: Double){
    value = if(newValue >= 0) newValue else {
      println("Negative value rejected !")
      value
    }
  }
}
class Wallet{
  var balance: Double by NonNegativeDelegate(1000.0)
}
fun main() {
    val wallet = Wallet()
    println("Balance: ${wallet.balance}")
    wallet.balance = 500.5
    println("Balance: ${wallet.balance}")
    wallet.balance = -100.0
    println("Balance : ${wallet.balance}")
    
}