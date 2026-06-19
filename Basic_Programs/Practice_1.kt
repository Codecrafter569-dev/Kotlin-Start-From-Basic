fun main() {
    val greenNumber = listOf(474,9,983,84,384,90)
    val redNumber = listOf(12,89,9)
    
    val totalNumber: Int = greenNumber.count()+redNumber.count()
    println(redNumber)
    println(greenNumber)
    println(totalNumber)
    
    go()
}
fun go(){
  val SUPPORTED = setOf("HTTP","HTTPS","FTP")
  val requested = "smtp"
  val isSupported = requested.uppercase() in SUPPORTED
  
  println("Support for $requested: $isSupported")
  
  val number2Word = mapOf(1 to "one",2 to "two", 3 to "three")
  val n = 2
  println("$n is splet at '${number2Word[n]}'")
}