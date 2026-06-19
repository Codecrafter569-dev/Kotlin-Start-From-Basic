interface Order {
    val orderId: String
    val userName: String
    val totalOrder: Double
}

data object OrderOne : Order {
    override val orderId = "001"
    override val userName = "Alice"
    override val totalOrder = 15.9
}

data object OrderTwo : Order {
    override val orderId = "002"
    override val userName = "Vikash"
    override val totalOrder = 89.0
}

fun main() {

    println("Order Name: $OrderOne")
    println("Order ID: ${OrderOne.orderId}")
    println("User: ${OrderOne.userName}")
    println("Total: ${OrderOne.totalOrder}")

    println("Order Name: $OrderTwo")
    println("Order ID: ${OrderTwo.orderId}")
    println("User: ${OrderTwo.userName}")
    println("Total: ${OrderTwo.totalOrder}")

    if (OrderOne as Order == OrderTwo as Order) {
        println("This is same")
    } else {
        println("This is different")
    }
}