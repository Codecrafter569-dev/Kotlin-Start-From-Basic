data class Temperature(val celsius: Double){
  val fahrenheit: Double = celsius * 9 / 5 + 32
  companion object {
    fun fromFahrenheit(fahrenheit : Double): Temperature = Temperature((fahrenheit - 32)*5/9)
  }
}
fun main() {
    val fe = 90.90
    val temp = Temperature.fromFahrenheit(fe)
    println("${temp.celsius}C is $fe F")
}