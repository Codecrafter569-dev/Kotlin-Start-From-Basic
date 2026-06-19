abstract class SmartDevice(val name: String){
  abstract fun turnOn()
  abstract fun turnOff()
}
class SmartLight(name: String): SmartDevice(name){
  override fun turnOn(){
    println("$name is now ON.")
  }
  override fun turnOff(){
    println("$name is now OFF")
  }
  
  fun adjustBrightness(level: Int){
    println("Adjusting $name brightness to $level%.")
  }
}
class SmartThermostat(name: String): SmartDevice(name){
  override fun turnOn(){
    println("$name thermostat is now heating")
  }
  override fun turnOff(){
    println("$name thermostat is now off.")
  }
  fun adjustBrightness(temperature: Int){
    println("$name thermostat set to $temperature")
  }
}
fun main() {
    val livingRoomLight = SmartLight("Living Room Light")
    val bedroomThermostat = SmartThermostat("Bedroom Thermostat")
    
    livingRoomLight.turnOff()
    livingRoomLight.adjustBrightness(200)
    livingRoomLight.turnOn()
    
    bedroomThermostat.turnOff()
    bedroomThermostat.turnOn()
    bedroomThermostat.adjustBrightness(10)
}