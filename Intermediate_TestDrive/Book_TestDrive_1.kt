class Book {
  var title = ""
  var price = 0
}
fun main() {
    val book = Book().apply{
      title = "Kotlin Basics"
      price = 500
    }
    println(book.title)
    println(book.price)
}