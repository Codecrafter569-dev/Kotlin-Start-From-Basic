sealed class AppStatus
data object Started: AppStatus()
data object Stopped : AppStatus()
fun show(status : AppStatus){
  println(status)
}
fun main() {
    println(show(Started))
    println(Stopped)
}