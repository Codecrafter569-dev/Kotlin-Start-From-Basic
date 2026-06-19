enum class Delivery{ STANDARD , EXPEDITED}
class Order(val itemCount:Int)
fun getShippingCostCalculator(delivery:Delivery): (Order) -> Double {
  if(delivery == Delivery.EXPEDITED){
    return { order -> 6 + 22.2 * order.itemCount }
  }
  return { order -> 1.2 * order.itemCount }
}
fun main(){
  val expedited = getShippingCostCalculator(Delivery.EXPEDITED)
  val standard = getShippingCostCalculator(Delivery.STANDARD)
  
  println("expedited (3 items): ${expedited(Order(3))}")
  println("Standard (3 items): ${expedited(Order(3))}")
  println("expedited (5 items): ${expedited(Order(5))}")
}