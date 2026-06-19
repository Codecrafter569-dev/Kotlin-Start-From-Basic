data class Book(val title: String,val author: List<String>)
fun main(){
  val library = listOf(
  Book("Kotlin in Action",listOf("Isakova","Elizarov","Jemerov")),
  Book("Atomic Kotlin",listOf("Eckel","Isakova")),
  Book("Three-Body", listOf("Liu"))
  )
  
  val authors = library.map{ it.author}
  println(authors)
  
  val flat = library.flatMap{it.author }
  println(flat)
  println(flat.toSet())
  
  
  val nested = listOf(1..3,5..8,9..22,23..29)
  val flatList = nested.flatMap{ it.toList() }
  println(flatList)
  
  
  val sentences = listOf(
  "Kotlin is fun",
  "Lambda are powerfull",
  "Collection are great"
  )
  
  val words = sentences.flatMap{ it.split(" ") }
  println(words)
  
  val unique = words.toSet()
  println(unique)
}