fun Int.isPositive(): Boolean = this >  0
fun String.toLowercase(): String = this.lowercase()
fun main() {
    println("This is the positive number :"+393.isPositive())
    println("This is the negetive number :"+78.isPositive())
    println("Vikash".toLowercase())
}