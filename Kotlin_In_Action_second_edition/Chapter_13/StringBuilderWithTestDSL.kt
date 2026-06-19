fun main(){
  val s1 = buildString1 {
    it.append("Hello,")
    it.append("World Bro ..")
    it.append("!!!!...")
  }
  println(s1)
  
  val s2 = buildString2{
    append("Hello , ")
    append("World !! ")
    append(" (V2)  ")
    this.append(" Explicit this also works  ...")
  }
  
  println(s2)
  
  val addGreeting : StringBuilder.()  -> Unit = {
    append("Hi there !!")
  }
  println(addGreeting)
  val s3 = buildString2(addGreeting)
  println(s3)
  
  
  val s4 = StringBuilder().apply{
    append("apply ")
    append(" also works")
    append(" With you bro")
  }.toString()
  
  println(s4)
}
fun buildString1(action : (StringBuilder) -> Unit): String{ 
val sb = StringBuilder()
action(sb)
return sb.toString()
}

fun buildString2(action : StringBuilder.() -> Unit): String{
  val sb = StringBuilder()
  sb.action()
  return sb.toString()
  
}