open class Device {
  fun powerOn(){
    println("Power On")
  }
}
class Phone : Device(){
  fun powerOff(){
    println("Power Off")
  }
}
fun main() {
    val p1 = Phone()
    p1.powerOn()
    p1.powerOff()
}