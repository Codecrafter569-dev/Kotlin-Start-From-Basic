fun getDisplayName(input:String) : String {
  return input.trim().ifBlank {"Anonymous" }
}
fun main(){
  println(getDisplayName("Vikash"))
  println(getDisplayName("  "))
  println(getDisplayName(""))
}