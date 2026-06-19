fun main() {
    val temperatures = listOf(14,89,90,45,78,23,33,88)
    
    println("${temperatures.maxOrNull() ?: "No data"}")
    println("${temperatures.minOrNull() ?: "No data"}")
    
    val singleHotDay = temperatures.singleOrNull{ it == 30}
    println("Single hot day with 30 degrees: ${singleHotDay ?: "None"}")
}