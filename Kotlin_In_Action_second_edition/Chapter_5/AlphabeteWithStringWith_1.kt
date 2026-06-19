fun alphabeWithExplicitThis(): String{
  val stringBuilder = StringBuilder()
  
  return with(stringBuilder){
    for(letter in 'A'..'Z'){
      this.append("$letter ")
    }
    this.append("\nThis is all alphabets ..")
    
    this.toString()
  }
}
fun main(){
  println(alphabeWithExplicitThis())
  
  println(alphabeWithExplicitThis())
}