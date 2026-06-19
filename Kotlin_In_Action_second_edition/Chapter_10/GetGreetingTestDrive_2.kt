fun getGreeter(language: String): (String) -> String {
  return when(language.lowercase()){
    "english"  -> { name -> "Hello $name !"}
    "spanish"  -> {name -> "¡Hola $name !"}
    "french"  -> { name -> "Bonjour, \$name!" }
    else  -> {name -> "Hii, $name !"}
  }
}
fun main(){
  val english = getGreeter("english")
  val spanish = getGreeter("spanish")
  val other = getGreeter("french")
  
  println(english("Vikash"))
  println(spanish("Vikash"))
  println(other("Aalok"))
}