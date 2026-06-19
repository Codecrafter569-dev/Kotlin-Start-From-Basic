interface Message {
    fun sentMessage(message: String)
    fun recevieMessage(): String
}
class BasicMassanger(): Message{
  override fun sentMessage(message: String){
    println("Sending a message : $message .")
  }
  override fun recevieMessage(): String{
    return "you have a new Message."
  }
}
class SmartMessage(val besicMassanger: BasicMassanger): Message by besicMassanger {
  override fun sentMessage(message: String){
    println("Sending a smart message : $message")
    besicMassanger.sentMessage("[Smart] :$message")
  }
}
fun main() {
    val message = BasicMassanger();
    message.sentMessage("Hello how are you and what are you doing.")
    println(message.recevieMessage())
    
    val m1 = SmartMessage(message)
    m1.sentMessage("How i can get a money  you hava a any ideya")
   println(m1.recevieMessage()) 
}