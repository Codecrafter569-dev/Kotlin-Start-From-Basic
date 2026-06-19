fun sentNotification(recipientAddress:String): String {
  println("Yo $recipientAddress")
  println("Yo you")
  return "Notification sent!"
}
fun getNextAddree(): String {
    return "sebatian@jetbrains.com"
}
fun getDouble(num:Long): Long{
    return num*2
}
fun main() {
val noti: String? = sentNotification("Hello bro how to do that and witch")
    println("Hello i Will sent the notification :$noti")
    println(getNextAddree())
    println(getDouble(67))
    
    val address : String? = getNextAddree()
    val confirm = if (address != null) {
        sentNotification(address)
    }else {
      null
    }
    println(confirm)
    
}