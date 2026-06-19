fun printFirst(list: List<*>){
  if(list.isNotEmpty()){
    println(list.first())
  }
}

fun <T> printFirstGenric(list: List<T>){
  if(list.isNotEmpty()){
    val item : T = list.first()
    println(item)
  }
}
fun main(){
  printFirst(listOf("Vikash","Hello","Bro","How"))
  printFirstGenric(listOf(1,2,3,45,6))
}