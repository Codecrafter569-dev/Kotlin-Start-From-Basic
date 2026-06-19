fun showProgress(progress: Int){
  val precent = progress.coerceIn(0,100)
  println("We're $precent done!")
}
fun main(){
  showProgress(92)
  showProgress(202)
  showProgress(-39)
}