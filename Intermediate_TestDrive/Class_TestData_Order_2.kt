data class Order(val id: String?)
data class Customer(val order: Order?)
fun main() {
    val customer = Customer(Order(null))
    
    val orderId = customer.order?.id ?: "ORDER-000"
    println(orderId)
}