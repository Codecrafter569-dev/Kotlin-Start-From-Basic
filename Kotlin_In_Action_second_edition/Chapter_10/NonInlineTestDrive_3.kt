fun <T> withLoggingRegular(tag: String,block:() -> T): T {
  println("[$tag] STATE")
  val result = block()
  println("[$tag] END")
  return result
}

inline fun <T> withLogging(tag:String,block: () -> T): T{
 println("[$tag] START")
    val result = block()
    println("[$tag] END")
    return result 
}
fun main(){
  val a = withLoggingRegular("DB"){
    "Fetch record #49"
  }
  println(a)
  
 val b = withLogging("DB"){
   "Fetched record #45"
 }
 println(b)
}