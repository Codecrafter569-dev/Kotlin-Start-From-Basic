fun printSum(c: Collection<*>) {
    // Unchecked cast — compiler warns but allows it
    // At runtime, JVM only checks: "is this a List?" — NOT "is this a List<Int>?"
    val intList = c as? List<Int>
        ?: throw IllegalArgumentException("List is expected")

    println(intList.sum())
}

fun main() {
    // ✅ Works fine
    printSum(listOf(1, 2, 3))
    // Output: 6

    // ❌ Throws IllegalArgumentException — it's a Set, not a List
    try {
        printSum(setOf(1, 2, 3))
    } catch (e: IllegalArgumentException) {
        println("Caught: ${e.message}")
        // Caught: List is expected
    }

    // ⚠️ Dangerous! Cast succeeds (List erased to List<*>), but sum() fails later
    try {
        printSum(listOf("a", "b", "c"))
    } catch (e: ClassCastException) {
        println("Caught: ${e.message}")
        // Caught: String cannot be cast to Number
    }
}
