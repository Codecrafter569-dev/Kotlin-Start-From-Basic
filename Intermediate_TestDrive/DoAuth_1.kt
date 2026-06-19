interface DoAuth {
    fun takeParma(username: String,password: String)
}
object Auth: DoAuth {
    override fun takeParma(username: String,password: String): Unit {
        println("Input Auth parameters: $username : $password")
    }
}
fun main() {
    Auth.takeParma("Anmol kumar","NinjaWay")
}