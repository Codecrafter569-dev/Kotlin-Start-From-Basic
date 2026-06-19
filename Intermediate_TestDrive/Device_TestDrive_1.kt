open class Device(val brand: String)
interface Chargeable {
    fun charge()
}
class Phone(brand : String) : Device(brand), Chargeable {
  override fun charge(){
    println("$brand is charging")
  }
}
fun main() {
    val p = Phone("OnePlus")
    p.charge()
}