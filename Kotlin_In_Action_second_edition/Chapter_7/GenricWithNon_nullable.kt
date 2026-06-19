fun <T> printHashCode(t: T){
  println(t?.hashCode())
}
fun main(){
  printHashCode(null)
  printHashCode(43)
  printHashCode("Hello")
}