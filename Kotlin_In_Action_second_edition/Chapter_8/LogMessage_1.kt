fun longMessage(msg: String) : Unit{
  println("[LOG] $msg")
}
fun crash(reason: String) : Nothing {
  throw RuntimeException("CRASH : $reason")
}
fun getStatus(code: Int) : String {
  return when(code){
    200 -> "Ok"
    404  -> "Not Found"
    else -> crash("Unknown code : $code")
  }
}
fun main(){
  longMessage("App started.....")
  println(getStatus(200))
  println(getStatus(404))
  println(getStatus(58393))
}