fun String.filter(predicate:(Char) -> Boolean): String {
  return buildString{
    for(char in this@filter){
      if(predicate(char)) append(char)
    }
  }
}
fun main(){
  println("HelloBro2832".filter{it in 'a'..'z'})
  println("Hello world! 1243".filter{it.isLetter()})
  println("Kotlin, World! 123".filter{it.isDigit()})
}