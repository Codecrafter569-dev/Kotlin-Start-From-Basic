fun <T: Any> printHashCode(t: T){
  println(t.hashCode())
}
fun main(){
  printHashCode(88)
  printHashCode("Hello")
 //  printHashCode(null)
}