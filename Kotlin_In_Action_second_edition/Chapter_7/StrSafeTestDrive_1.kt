fun strLength(s: String?): Int = s?.length ?: 0
fun main(){
  println(strLength("Vikash"))
  println(strLength("Hello"))
  println(strLength("Bolo be"))
  println(strLength(null))
}