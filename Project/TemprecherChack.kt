fun celsiusToFahrenheit(celsius: Double): Double{
  return (celsius* 9/5)+32
}
fun fahrenheitToCelsius(fehrenheit: Double): Double{
  return (fehrenheit-32)*5/9
}
fun main() {
    println("Temperature Converter")
    println("1. Celsius to Fehrenheit")
    println("2. Fehrenheit to Celsius")
    
    println("Enter your choice: ")
    val input = readLine()?.trim()
    val choice = input?.toIntOrNull()
    
    when(choice){
      1 -> {
        println("Enter Temperature in Celsius:")
        val celsius = readLine()!!.toDouble()
        val fehrenheit = celsiusToFahrenheit(celsius)
        println("Temperature in fehrenheit: $fehrenheit")
      }
      2 -> {
      println("Enter Temperature in Fehrenheit :")
        val fehrenheit = readLine()!!.toDouble()
        val celsius = fahrenheitToCelsius(fehrenheit)
        println("Temperature in Celsius: $celsius")
      }
      else -> {
        println("Enter a invalide ")
      }
    }
}