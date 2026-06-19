fun printMessageWithPrefix(message: Collection<String>,prefix : String){
  message.forEach{
    println("$prefix ---> $it")
  }
}
fun main(){
  val error = listOf("403 Forbidden","404 Not Found")
  printMessageWithPrefix(error,"Error :")
}