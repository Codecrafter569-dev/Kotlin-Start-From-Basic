fun main(){
  greet("Sukuyomi")
}

fun greet(name:String){
  println("Hello,$name!");
  hooo("goooo");
}
fun hooo(name:String){
  val poem = """
  |Roses are red,
  |Violets are blue,
  |kotlin is concise,
  |And so are you.
  """.trimMargin()
  println(poem);
}