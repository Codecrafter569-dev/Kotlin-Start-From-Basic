fun String.process(
     condition: (Char) -> Boolean,
     transform: (Char) -> Char
): String {
  return buildString{
    for(char in this@process){
      if(condition(char)){
        append(transform(char))
      }
    }
  }
}

fun main(){
  println("Hello7383 World".process({it.isLetter()},{it.uppercaseChar()}))
  println("Nano9393Bro".process({it.isDigit()},{it}))
  
  println("Kotlin10202".process({it.isLetterOrDigit()},{it.lowercaseChar()}))
}