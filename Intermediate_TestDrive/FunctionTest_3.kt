
fun main() {
    val itemPrice = listOf(10,20,70,90,47,23)
    
    val totalPrice = itemPrice.reduceOrNull{ runningTotal, price -> runningTotal + price}
    println("${totalPrice ?: "No items"}")
    
    
    val emptyCart = listOf<Int>()
    val emptyTotalPrice = emptyCart.reduceOrNull{ runningTotal, price -> runningTotal + price}
    
    println("${emptyTotalPrice ?: "No item"}")
}