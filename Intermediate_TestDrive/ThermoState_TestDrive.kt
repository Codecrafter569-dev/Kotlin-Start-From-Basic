import kotlin.properties.Delegates.observable
class Thermostat{
  var temperature: Double by observable(20.0){_,old,new ->
    if (new > 25) {
        println("Warning: Temperature is to high ! ($old°C -> $new °C)")
    } else {
      println("Temperature updated: $old°C -> $new °C")  
    }
  }
}
fun main() {
    val thermostat = Thermostat()
    thermostat.temperature = 22.25
    thermostat.temperature = 89.90
}