enum class TrafficLight{
  RED,GREEN,YELLOW
}
fun main() {
    val signal = TrafficLight.RED
    
    when(signal){
      TrafficLight.RED -> println("Stop!")
      TrafficLight.GREEN -> println("Go ---->")
      TrafficLight.YELLOW -> println(" Get Ready ....")
    }
    
}