interface Printable {
    fun print()
}
class Report: Printable{
  override fun print(){
    println("Now report is ready to print.")
  }
}
fun main() {
    val p = Report()
    p.print()
}