class Ticket(val price: Int){
  fun showPrice(){
    println("Ticket price = Rs.$price")
  }
  fun discount(precent: Int){
    val newPrice = price - (price * precent/100)
    println("Discount price = Rs.$newPrice")
  }
}
fun main() {
    val t = Ticket(600)
    t.showPrice()
    t.discount(10)
}