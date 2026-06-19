// ❌ Problem: Both lists have same type T — too restrictive
fun <T> copyDataNaive(
    source: MutableList<T>,
    destination: MutableList<T>
) {
    for (item in source) {
        destination.add(item)
    }
}

// ✅ Solution 1: Two type parameters T and R (R is supertype of T)
fun <T : R, R> copyDataTwoParams(
    source: MutableList<T>,      // source elements are T
    destination: MutableList<R>  // destination accepts R (supertype of T)
) {
    for (item in source) {
        destination.add(item)
    }
}

// ✅ Solution 2: Use-site variance with 'out' on source (cleaner!)
fun <T> copyDataOutProjected(
    source: MutableList<out T>,  // source is out-projected: only read from it
    destination: MutableList<T>
) {
    for (item in source) {
        destination.add(item)
    }
}

// ✅ Solution 3: Use-site variance with 'in' on destination
fun <T> copyDataInProjected(
    source: MutableList<T>,
    destination: MutableList<in T>  // destination is in-projected: only write to it
) {
    for (item in source) {
        destination.add(item)
    }
}

fun main() {
    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()

    // ✅ Solution 1: T=Int, R=Any (Int is subtype of Any)
    copyDataTwoParams(ints, anyItems)
    println("After copyDataTwoParams: $anyItems")
    // After copyDataTwoParams: [1, 2, 3]

    anyItems.clear()

    // ✅ Solution 2: out-projected source
    copyDataOutProjected(ints, anyItems)
    println("After copyDataOutProjected: $anyItems")
    // After copyDataOutProjected: [1, 2, 3]

    anyItems.clear()

    // ✅ Solution 3: in-projected destination
    copyDataInProjected(ints, anyItems)
    println("After copyDataInProjected: $anyItems")
    // After copyDataInProjected: [1, 2, 3]
}
