sealed class NetworkState 
data object Connected : NetworkState()
data object Disconnected {
    val name: String = "Viaksh Kumar"
}
fun main() {
    println(Connected)
    println(Disconnected.name)
}