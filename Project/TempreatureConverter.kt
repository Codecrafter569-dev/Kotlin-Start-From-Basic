fun main() {
    val celsiusReading : Double = 39.3
    
    val toFahrenheit = (celsiusReading * 9/5)+32
    val toKelvin = celsiusReading+273.15
    
    var isFever = false
    var statusMsg = "Normal"
    
    if (celsiusReading >= 37.5) {
        isFever = true
        statusMsg = "FEVER DETECTED"
    }
    val absoluteZeroKelvin: Long = 0L;
    
    println(" Temperature Converter")
    println("Celsius   : $celsiusReading °C")
    println("Kalvin    : $toKelvin °K")
    println("Fahrenheit: $toFahrenheit °F")
    println("Abs. Zero : $absoluteZeroKelvin °K")
    println("Fever?    : $isFever")
    println("Status    : $statusMsg")
}