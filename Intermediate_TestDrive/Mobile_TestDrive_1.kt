class Mobile(var brand: String) {
    fun call(){
      println("$brand is Calling")
    }
    fun charge(){
      println("$brand is charging")
    }
}

fun main() {
    val m = Mobile("Samsung")
    m.call()
    m.charge()
}