class Book {
  var bookName = ""
  var price = 0
}
fun madeBook(block: Book.() -> Unit): Book {
  val b = Book()
  b.block()
  return b
}
 fun main() {
     val b = madeBook{
       bookName = "Head first java"
       price = 1850
     }
     println(b.bookName)
     println(b.price)
 }