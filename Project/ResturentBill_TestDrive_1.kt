fun main() {
    val restaurant = "The Golden Fork"
    val customerName = "Vikash Kumar"
    val tableNumber = 7
    
    val item1 = "Grilled Salmon"; val price1 = 24.99
    val item2 = "Caesar Salad"; val price2 = 12.50
    val item3 = "Mango Sorbet"; val price3 = 7.45
    
    val subtotal = price1+price2+price3
    val taxRate = 0.08
    val tax = subtotal *taxRate
    val tip = subtotal * 0.15
    val total = subtotal +tax+tip
    
val receipt = """
        ╔══════════════════════════════╗
        ║   ${restaurant.uppercase()}   ║
        ╠══════════════════════════════╣
        ║ Customer : $customerName
        ║ Table    : #$tableNumber
        ╠══════════════════════════════╣
        ║ $item1 ........... $${"%.2f".format(price1)}
        ║ $item2 ........ $${"%.2f".format(price2)}
        ║ $item3 .......... $${"%.2f".format(price3)}
        ╠══════════════════════════════╣
        ║ Subtotal : $${"%.2f".format(subtotal)}
        ║ Tax (8%) : $${"%.2f".format(tax)}
        ║ Tip (15%): $${"%.2f".format(tip)}
        ╠══════════════════════════════╣
        ║ TOTAL    : $${"%.2f".format(total)}
        ╚══════════════════════════════╝
    """.trimIndent()
    
    println(receipt)
}