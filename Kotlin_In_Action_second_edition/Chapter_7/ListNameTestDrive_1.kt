fun main(){
  val names: List<String>? = listOf("Alice","Bob","Charlie")
  
  val nullList: List<String>? = null
  
  println(names?.size)
  println(names?.first())
  println(names?.filter{ it.length >  3})
  
  println(nullList?.size)
  println(nullList?.first())
  
}