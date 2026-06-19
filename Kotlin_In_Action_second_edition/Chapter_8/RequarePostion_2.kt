fun requirePosition(n : Int , label: String) : Int {
  return if( n > 0) n 
  else throw IllegalArgumentException("$label must be positive , got $n")
}
data class BankAccount(val id: String, val balance : Double){
  init {
    requirePosition(id.length,"ID length")
    if(balance < 0) throw IllegalArgumentException("Balance negative")
  }
  
}
fun main(){
  val account = BankAccount("ACC001",500.0)
  println(account)
}