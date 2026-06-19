data class Thermostat(val room: String) {
    var temperature: Int = 20
      private set
    fun setTemperature(requested: Int) {
        temperature = requested.coerceIn(16, 30)  // safe range only
        println("$room set to $temperature°C")
    }
}

fun main() {
    val living = Thermostat("Living Room")
    living.setTemperature(22)   // Living Room set to 22°C
    living.setTemperature(5)    // Living Room set to 16°C
    living.setTemperature(45)   // Living Room set to 30°C
}