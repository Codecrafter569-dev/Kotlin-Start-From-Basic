import kotlin.math.*
fun calculate(P: Double,r: Double,n: Int,t: Int): Double{
  return P * (1+r/n).pow(n*t)
}
fun main() {
    val pricipal = 1000.0
    val rate = 0.05
    val timesCompunded = 4
    val years = 5
    val amount = calculate(pricipal,rate,timesCompunded,years)
    println("The accumulated amount is: $amount")
}