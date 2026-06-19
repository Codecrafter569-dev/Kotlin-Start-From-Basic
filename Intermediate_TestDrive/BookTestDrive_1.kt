class Book(val title: String , val author: String){
  fun printInfo(){
    println("Title: $title")
    println("author : $author")
  }
}
fun main() {
    val b1 = Book( "Head first java","Kati sarya,bonta")
    b1.printInfo()
}