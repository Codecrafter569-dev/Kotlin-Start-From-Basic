fun main() {
    val traficLightState = "Red"
    
    val traficLight = when{
      traficLightState == "Green" -> "Go"
      traficLightState == "Red" ->"Stop"
      traficLightState == "Yellow" -> "Slow down"
      else -> "Malfunction"
    }
    
    println(traficLight)
    
    
    val trafic =  when(traficLightState){
      "Red" -> "Stop"
      "Green" -> "Go"
      "Yellow" -> "Go slow"
      else -> "Malfunction"
    }
    
    println(trafic)
}