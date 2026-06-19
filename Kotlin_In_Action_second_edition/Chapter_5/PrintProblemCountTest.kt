fun printProblemCounts(respones: Collection<String>){
  var clientError = 0
  var serverError = 0
  respones.forEach{
    if(it.startsWith("4")){
      clientError++
    }else if(it.startsWith("5")){
      serverError++
    }
  }
  println("$clientError client error , $serverError server errors")
  
//  println()
}
fun main(){
val respones = listOf("200 Ok","418 I'm a teapot","500 Internal Server Error")  
printProblemCounts(respones)
}