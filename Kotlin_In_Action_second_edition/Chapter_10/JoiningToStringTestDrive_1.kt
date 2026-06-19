fun <T> Collection<T>.joinToString(separator:String =",",prefix: String ="",postfix:String ="", transform :(T) -> String = {it.toString()}): String{
  val result = StringBuilder(prefix)
  for((index,element) in this.withIndex()){
    if(index > 0) result.append(separator)
    result.append(transform(element))
  }
  result.append(postfix)
  return result.toString()
}
fun main(){
  val letters = listOf("Alpha","Beta","Gamma")
  println(letters.joinToString())
  println(letters.joinToString{it.lowercase()})
  println(letters.joinToString{it.uppercase()})
  println(letters.joinToString(separator = " | ",prefix ="[",postfix = "]",transform = {it.uppercase()}))
}