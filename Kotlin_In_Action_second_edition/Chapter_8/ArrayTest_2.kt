fun  processArrays(args: Array<String>){
  args.forEachIndexed{ index, element -> 
  println("Arguments $index is : $element") }
}

fun main(){
  val args = arrayOf("--host","localhost","--port")
  processArrays(args)
}