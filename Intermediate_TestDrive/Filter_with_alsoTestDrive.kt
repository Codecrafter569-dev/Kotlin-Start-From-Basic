fun main() {
    val medals: List<String> = listOf("Gold","Silver","Bronze")
    val reversedLongUppercaseMedals: List<String> = medals.map {it.uppercase() }
    .also{println(it)}
    .filter{ it.length > 4}
    .also{ println(it) }
    .reversed()
    
    println(reversedLongUppercaseMedals)
}