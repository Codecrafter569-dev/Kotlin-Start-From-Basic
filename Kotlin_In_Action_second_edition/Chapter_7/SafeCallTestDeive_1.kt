
fun printAllCaps(str: String?){
  val allCaps: String? = str?.uppercase();
  
  println(allCaps)
}
fun main(){
  printAllCaps("abc3")
  printAllCaps(null)
}