fun main() {
    val languages = mutableListOf("Java")
    languages.add("Kotlin")
    languages.add("Python")
    println("The List Is :$languages")
    println("\$x")
    
    val name = readln()
    if (name.isNotBlank()) {
        println("Hello, ${name.length} - letter Person !")
    }
}