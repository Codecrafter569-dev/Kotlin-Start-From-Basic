fun reconige(c: Char): String = when(c){
  in '0'..'9'  -> "It's digit!"
  in 'a'..'z', in 'A'..'Z'  -> "it's letter"
  else -> "i don't know"
}
fun main() {
    println(reconige('8'))
    println(reconige('v'))
    println(reconige('t'))
    println(reconige('9'))
    println("Kotlin" in "Java".."Scala")
    
    println("Kotlin" in setOf("java","python"))
}