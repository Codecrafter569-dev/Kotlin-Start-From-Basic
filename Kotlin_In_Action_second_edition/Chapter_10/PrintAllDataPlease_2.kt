fun <T> printAll(
items: List<T>,
transform: (T) -> String = {it.toString() }
){
  for(item in items){
    println(transform(item))
  }
}
fun main(){
  printAll(listOf(1,2,3,45,6,9))
  printAll(listOf("Hello","World","Numo","Koko")){it.uppercase() }
  
  printAll(listOf(1.23,4.89,90.3)){
   "${"%.1f".format(it)}" }
  
}