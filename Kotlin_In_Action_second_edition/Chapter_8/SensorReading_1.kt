data class SansorReading(val rawValue: Int){
  fun toVoltage() : Double = rawValue.toDouble() / 1023.0 * 5.0
  
  fun toPercent(): Float = rawValue.toFloat() / 1023.0f * 100.0f
  
  fun toByteCode() : Byte = rawValue.coerceIn(0,127).toByte()
  
  
}

fun main(){
  val reading = SansorReading(899)
  println("${reading.toVoltage() } V ")
  println("${reading.toPercent()} % ")
  println(reading.toByteCode())
}