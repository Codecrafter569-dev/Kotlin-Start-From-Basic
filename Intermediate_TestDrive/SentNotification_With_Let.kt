fun sentNotification(recipientAddress: String): String {
    println("Yo $recipientAddress")
    return "Notification sent"
}
fun getNextAddress(): String {
    return "sebastian@jetbrans.com"
}
fun main() {
    val address: String = getNextAddress()
    val confim = address?.let{
      sentNotification(it);
    }
    println("address = $address")
    println("confim = $confim")
}