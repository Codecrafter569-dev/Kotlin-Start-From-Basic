data class Book(val name: String,val author:String,val bookId:Int)
//fun copy(name:String = this.name,author: String = this.author,bookId:Int = this.bookId)
// Book(name,author,bookId)
fun main(){
  val v1 = Book("Head first java","Kathi sreaaa",9249)
  val v2 = Book("Head first python","Robert Zosess",3835)
  
  val moveV1 = v1.copy(name = "Head first Kotlin")
  
  println(v1)
  println(v2)
  println(moveV1)
  
  val removeAndMove = v1.copy(name="Head first dising pattern",bookId = 2833)
  
  val clone = v2.copy()
  println(clone == v2)
  println(clone === v2)
}