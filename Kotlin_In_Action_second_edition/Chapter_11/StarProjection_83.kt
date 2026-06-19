// Star projection is useful when checking "is this some kind of Map/List/Pair?"
// without caring about the specific type arguments

fun describeCollection(value: Any) {
    when (value) {
        is List<*>  -> println("List with \${value.size} elements, first: \${value.firstOrNull()}")
        is Map<*, *> -> println("Map with \${value.size} entries, keys: \${value.keys}")
        is Set<*>   -> println("Set with \${value.size} elements")
        else        -> println("Not a collection: \$value")
    }
}

// Star projection in function parameters — accepts any Pair regardless of types
fun printPair(pair: Pair<*, *>) {
    println("(\${pair.first}, \${pair.second})")
}

// Validator pattern — validates structure without caring about type
fun isNonEmptyCollection(value: Any?): Boolean {
    return when (value) {
        is Collection<*> -> value.isNotEmpty()
        is Map<*, *>     -> value.isNotEmpty()
        else             -> false
    }
}

fun main() {
    describeCollection(listOf(1, 2, 3))
    // List with 3 elements, first: 1

    describeCollection(mapOf("a" to 1, "b" to 2))
    // Map with 2 entries, keys: [a, b]

    describeCollection(setOf("x", "y"))
    // Set with 2 elements

    describeCollection(42)
    // Not a collection: 42

    printPair("Hello" to 42)
    // (Hello, 42)

    printPair(true to listOf(1, 2, 3))
    // (true, [1, 2, 3])

    println(isNonEmptyCollection(listOf(1, 2, 3)))   // true
    println(isNonEmptyCollection(emptyList<Int>()))   // false
    println(isNonEmptyCollection(mapOf("a" to 1)))    // true
    println(isNonEmptyCollection(null))               // false
}
