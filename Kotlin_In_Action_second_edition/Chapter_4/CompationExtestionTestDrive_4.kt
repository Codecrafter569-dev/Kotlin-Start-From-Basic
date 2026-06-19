class Movie(val title:String,val year:Int){
  companion object
}
fun Movie.Companion.fromCSV(text:String): Movie {
  val texts = text.split(",")
  return Movie(texts[0].trim(),texts[1].trim().toInt())
}
fun main(){
  val movie = Movie.fromCSV("Inception,2020")
  println("${movie.title} ${movie.year}")
}