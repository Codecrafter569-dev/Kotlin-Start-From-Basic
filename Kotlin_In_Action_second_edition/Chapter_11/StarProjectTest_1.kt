fun printAllElements(container : MutableList<*>){
  for(ele in container){
    println(" -> $ele == (${ele?.javaClass?.simpleName})")
  }
}

fun clearIfLarge(container : MutableList<*>){
  if(container.size  > 3){
  container.clear()
    println("The list is now become to clean because this is too largee...")
  }else{
    println("The container is not to large so no need to clean")
  }
}
fun main(){
  val mixList : MutableList<Any?> = mutableListOf(1,2,3,"Hello",'V',true,null)
  
  printAllElements(mixList)
  
  clearIfLarge(mixList)
  val small = mutableListOf("a","b")
  clearIfLarge(small)
}