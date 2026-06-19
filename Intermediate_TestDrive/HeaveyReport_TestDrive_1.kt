
class HeavyReport{
  val data: List<Int> by lazy {
    println(" Loading report data...")
    (1 .. 1000).toList()
  }
}
fun main() {
    val report = HeavyReport()
    println("Report Object created.")
    println("First access: ${report.data.size} records")
    println("Second access: ${report.data.size} records")
}