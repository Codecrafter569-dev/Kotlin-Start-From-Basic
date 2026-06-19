fun describleList(list : MutableList<*>){
  println("Size : ${list.size}")
  if(list.isNotEmpty()){
    val element : Any? = list[0]
    println("First element : $element")
    println("Type : ${element?.javaClass?.simpleName}")
  }
}
fun main(){
  val intList : MutableList<Int> = mutableListOf(10,20,30,40)
  val strList : MutableList<String> = mutableListOf("Vikash","Asis","Hello")
  
  describleList(intList)
  describleList(strList)
}