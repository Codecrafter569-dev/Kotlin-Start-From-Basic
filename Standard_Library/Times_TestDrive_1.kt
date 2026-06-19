import kotlin.time.measureTime
fun main() {
    val timeTaken = measureTime {
      val data = List(1000) { it * 2}
      val filterData = data.filter{ it % 3 == 0}
      
      val proce = filterData.map{ it / 2}
      println("Processed data")
      println(proce)
      
    }
    println("Time taken :$timeTaken")
}