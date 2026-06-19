fun ignoreNulls(str: String?){
  val strNotNull : String = str!!
  
  println(strNotNull.length)
  
}
fun main(){
  ignoreNulls("Hello")
  ignoreNulls(null)
}