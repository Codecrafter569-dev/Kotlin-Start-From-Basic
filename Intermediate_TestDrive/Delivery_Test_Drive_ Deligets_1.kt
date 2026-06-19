interface Delivery {
    fun deliver()
}
class BikeDelivery : Delivery {
  override fun deliver(){
    println("the parsal is ready to deliver using a bike.")
  }
}
class OrderService(private val delivery: Delivery) : Delivery by delivery
fun main() {
    val p1 = OrderService(BikeDelivery())
    p1.deliver();
}