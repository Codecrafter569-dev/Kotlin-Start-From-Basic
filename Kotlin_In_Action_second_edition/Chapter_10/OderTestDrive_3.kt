data class Order(val id:Int,val amount:Double,val status:String)
val orders = listOf(
Order(1,250.0,"DELIVERED"),
Order(2,1200.0,"PENDING"),
Order(3,86.9,"DELIVERED"),
Order(4,450.0,"CENCELLED"),
Order(5,990.0,"PENDING")
)

fun List<Order>.totalAmountFor(predicate:(Order) -> Boolean): Double = filter(predicate).sumOf{it.amount}

fun List<Order>.countFor(predicate:(Order) -> Boolean): Int = count(predicate)
fun main(){
  println("Delivered total: ${orders.totalAmountFor{it.status =="DELIVERED" }}")
  
  
  println("Pending total : ${orders.totalAmountFor{it.status == "PENDING"}}")
  
  
  println("High - value count: ${orders.countFor{it.amount > 500.0}}")
}