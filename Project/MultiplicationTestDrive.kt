fun main() {
    println("Enter a Number :")
    
    val input = readLine()?.trim()
    val number = input?.toIntOrNull()
    
    if (number == null) {
        println("Invalid input! Please enter a valid number.")
        return
    }
    
    println("Multiplication Table of $number")
    
    for (i in 1..10) {
       // val va = number * i
        println("$number x $i = ${number*i}")
    }
}