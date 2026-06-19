import java.util.Scanner

fun main() {
    // VVI: System.`in` allows interaction with the keyboard
    val scanner = Scanner(System.`in`)
    
    print("Enter a number: ")
    
    // Check if input is actually an integer to avoid crashes
    if (scanner.hasNextInt()) {
        val num = scanner.nextInt()
        
        // VVI Logic: Checking Even/Odd
        if (num % 2 == 0) {
            println("Even number")
        } else {
            println("Odd number")
        }
    } else {
        println("Invalid input! Please enter a valid number.")
    }
}
