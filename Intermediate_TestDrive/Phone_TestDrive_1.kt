open class Phone{
  open fun call(){
    println("Calling ....")
  }
}
class SmartPhone : Phone(){
  override fun call(){
    super.call()
    println("Using internet call")
  }
}
fun main() {
    val a1 = SmartPhone()
    a1.call()
}