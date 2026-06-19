fun printFirst(list: List<*>){
  if(list.isNotEmpty()){
    println(list.first())
  }
}

fun <T>  printFirstWithT(list : List<T>){
  if(list.isNotEmpty()){
    println(list.first())
  }
}
fun main(){
  printFirst(listOf("Hello","Bebe"))
  printFirst(listOf(true,false))
  printFirst(listOf(90,89))
  printFirst(emptyList<Nothing>())
  printFirstWithT(listOf("Vikash"))
}