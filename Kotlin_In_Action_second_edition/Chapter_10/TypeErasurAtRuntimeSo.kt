fun describeList(l: List<*>) {
    when {
        l.isEmpty()           -> println("Empty list")
        l.first() is String   -> println("Looks like Strings: $l")
        l.first() is Int      -> println("Looks like Integers: $l")
        else                  -> println("Other: $l")
    }
}

fun main() {
    describeList(listOf("a", "b"))   // Looks like Strings: [a, b]
    describeList(listOf(1, 2, 3))    // Looks like Integers: [1, 2, 3]
    describeList(emptyList<Any>())   // Empty list
}
