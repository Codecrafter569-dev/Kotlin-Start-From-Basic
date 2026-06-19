fun main() {
    print("Enter a first number :")
    val a = readln().toDouble()
    print("Enter a second number :")
    val b = readln().toDouble()
    
    println("\n--- Result ---- ")
    println("Sum : ${a+b}")
    println("diff : ${a-b}")
    println("Product :${a*b}")
    println("Division: ${"%.2f".format(a.toDouble()/b)}")
}