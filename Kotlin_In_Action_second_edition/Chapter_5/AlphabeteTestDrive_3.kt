
fun alphabete() = buildString {
  for(latter in 'A'..'Z'){
    append(latter)
  }
  append("\nNow i Know the alphabetes...")
}
fun main(){
  println(alphabete())
  
  
  val report = buildString {
    append("Report: \n")
    for(i in 1..3){
      appendLine(" Item $i : value = ${ i * 10 }")
      
    }
    append("Total items : 3 ")
  }
  
  println(report)
}