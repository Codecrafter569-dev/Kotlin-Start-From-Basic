interface Printer {
    fun printer()
}
class ConsolePrinter(val p: String) : Printer {
  override fun printer(){
    println("Printing from console .")
    println("This is the $p.")
  }
}
class Report(private val printer: Printer): Printer by printer
fun main() {
    val report = Report(ConsolePrinter("Vikash kumar  how to get much of the power and what are you doing"))
    report.printer()
}