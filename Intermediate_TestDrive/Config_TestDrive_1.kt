class Config(val map: Map<String, Any>){
  val host: String by map
  val port: Int by map
  val debug: Boolean by map
}
fun main() {
    val config = Config(mapOf("host" to "localhost","port" to 8080,"debug" to true))
    
    println("Host: ${config.host}")
    println("Port: ${config.port}")
    println("Debug: ${config.debug}")
}