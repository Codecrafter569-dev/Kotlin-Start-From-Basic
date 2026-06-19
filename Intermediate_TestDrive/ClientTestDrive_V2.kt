class Client() {
    var token: String? = null
    fun connect() = println("connected!")
    fun authenticate() = println("authenticate")
    fun getData(): String {
        println("getting data!")
        return "Mock data"
    }
}
val client = Client().apply {
    token = "Vikash"
    println("This is token $token")
    connect()
    authenticate()
}
fun main() {
   val he: String = client.getData()
   println("This is a val: $he")
   
   
   val result: String = client.run{
     connect()
     authenticate()
     getData()
     
   }
   println("This is the val: $result")
}