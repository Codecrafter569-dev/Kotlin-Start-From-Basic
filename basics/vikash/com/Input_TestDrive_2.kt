

fun main() {
    print("What is your Name:")
    val name = readln()
    print("What is your age: ")
    val age = readln()
    
    println("\nHello, $name")
    println("Tum $age saal ka ho.")
    println("Agle saal tum ${age.toInt()+1} ke hoga !")
    
}