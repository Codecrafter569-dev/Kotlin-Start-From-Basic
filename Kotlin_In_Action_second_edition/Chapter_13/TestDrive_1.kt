// ── Regular API (verbose, repetitive) ──────────────────────────────────
class PizzaBuilder {
    val toppings = mutableListOf<String>()
    var size = "medium"

    fun addTopping(topping: String) { toppings.add(topping) }
    fun set1Size(s: String) { size = s }
    fun build() = "Pizza[$size]: ${toppings.joinToString(", ")}"
}

// ── DSL-style API (clean, readable) ────────────────────────────────────
class PizzaDsl {
    val toppings = mutableListOf<String>()
    var size = "medium"

    fun topping(name: String) { toppings.add(name) }
    fun build() = "Pizza[$size]: ${toppings.joinToString(", ")}"
}

// DSL entry function — takes a lambda with receiver
fun pizza(block: PizzaDsl.() -> Unit): PizzaDsl {
    val p = PizzaDsl()
    p.block()   // 'this' inside block = PizzaDsl instance
    return p
}

fun main() {
    // ── Regular API ────────────────────────────────
    val b = PizzaBuilder()
    b.set1Size("large")
    b.addTopping("cheese")
    b.addTopping("mushrooms")
    b.addTopping("olives")
    println("Regular: ${b.build()}")

    // ── DSL style ──────────────────────────────────
    val p = pizza {
        size = "large"       // direct property access — no setter needed
        topping("cheese")    // no 'b.' prefix needed
        topping("mushrooms")
        topping("olives")
    }
    println("DSL    : ${p.build()}")
}
