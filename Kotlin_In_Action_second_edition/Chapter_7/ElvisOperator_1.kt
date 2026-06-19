fun greet(name: String?){
  val recipient : String = name ?: "Unnamed"
  println("Hello, $recipient")
}
fun main(){
  greet("Vikash")
  greet(null)
}