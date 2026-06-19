fun main() {
    print("Enter a number: ")
    val input = readLine()?.trim()
    val number = input?.toIntOrNull()

    if (number == null) {
        println("Invalid input! Please enter a valid integer.")
    } else if (number % 2 == 0) {
        println("$number is Even")
    } else {
        println("$number is Odd")
    }
}