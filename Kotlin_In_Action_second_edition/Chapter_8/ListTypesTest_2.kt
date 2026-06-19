data class SensorLog(val readings : List<Double?>){
  fun average() : Double? {
    val valid = readings.filterNotNull()
    return if(valid.isEmpty()) null else valid.average()
  }
  fun missingCount(): Int = readings.count{it == null }
}
fun main(){
  val log = SensorLog(listOf(229.39,null,3.3,12.3,34.4,null,23.90,null))
  
  println("Average: ${log.average()}")
  println("MissingCount : ${log.missingCount()}")
  println("All readings : ${log.readings}")
}