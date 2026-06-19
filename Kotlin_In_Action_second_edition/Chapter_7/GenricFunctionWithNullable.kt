fun <T: Any> List<T?>.firstNonNull(): T? =
    this.firstOrNull { it != null }

fun main() {
    val list1 = listOf(null, null, "Kotlin", "Java")
    val list2 = listOf(null, null, null)
    val list3 = listOf(1, null, 3, null, 5)

    println(list1.firstNonNull())  // Kotlin
    println(list2.firstNonNull())  // null
    println(list3.firstNonNull())  // 1
}
