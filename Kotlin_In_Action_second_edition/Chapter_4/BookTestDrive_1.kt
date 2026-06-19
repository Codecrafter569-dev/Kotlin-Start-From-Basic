class Book(val name: String,val isdeNo : Int){
  override fun toString(): String{
    return "Book (name=$name , isdeNo=$isdeNo )"
  }
}
fun main(){
  val b1 = Book("Vikash Kumar",1)
  val b2 = Book("Vikash Kumar",1)
  println(b1)
  println(b2)
  println(b1 == b2)
  
  println(b1 === b2)
  
  println(b1 === b1)
}