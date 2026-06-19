fun main() {
    println("Enter your name :")
    val input = readln()
    val name = if(input.isNotBlank()) input else "Kotlin"
    println()
    println("Hello ,$name !")
}