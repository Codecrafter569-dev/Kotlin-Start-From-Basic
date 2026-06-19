class Book(val title: String){
  companion object Parser{
    fun fromText(text: String): Book {
      return Book(text.trim())
    }
  }
}
fun main(){
  val book = Book.Parser.fromText("   Clean Code   ")
  val book1 = Book.fromText("   Kotlin in Action   ")
  
  println(book.title)
  println(book1.title)
}