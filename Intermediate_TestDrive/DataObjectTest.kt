data object AppCofig{
  val appName: String = "My Application"
  val version: String = "1.0.0"
}
fun main() {
    println(AppCofig)
    println("My app name: ${AppCofig.appName}")
    println("Version : ${AppCofig.version}")
}