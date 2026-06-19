fun main() {
    val name :List<String>? = null
    println(name?.size ?: 0)
    
    val values = listOf("10","20","30","40","Vikash")
    val numbers = values.mapNotNull { it.toIntOrNull() }
    println(numbers)
}