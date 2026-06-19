class Client() {
    var token: String? = null
    
    fun connect() = println("connected!")
    fun authenticate() = println("authenticate")
    fun getData(): String {
      println("getting data!")
      return "Mock data"
    }
}

val client = Client()


fun main() {
    client.token = "asdf"
    client.connect()
    client.authenticate()
    client.getData()
}