class Temperature(val celsius: Double):
Comparable<Temperature>{
  override fun compareTo(other: Temperature): Int = celsius.compareTo(other.celsius)
  
  override fun toString() = "${celsius} °C"
}
fun main(){
  val t1 = Temperature(100.0)
  val t2 = Temperature(90.0)
  
  println(if(t1 > t2) "$t1 is hotter" else "$t2 is hotter..")
}