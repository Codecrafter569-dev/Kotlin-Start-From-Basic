interface Logger {
    fun log(msg: String)
}
class FileLogger : Logger {
  override fun log(msg: String){
    println("File log: $msg")
  }
}
class App(private val logger: Logger): Logger by logger 
fun main() {
    val app = App(FileLogger())
    app.log("App Started now you are ready ok.")
}