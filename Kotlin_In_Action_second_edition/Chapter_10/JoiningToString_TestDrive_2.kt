fun <T> Collection<T>.joinToStringNullable(separator:String =", ",prefix: String ="",postfix:String="",transform:((T) -> String)? = null): String {
  val result = StringBuilder(prefix)
  for((index,element) in this.withIndex()){
    if(index > 0) result.append(separator)
    
    val str = transform?.invoke(element) ?: element.toString()
    result.append(str)
  } 
  result.append(postfix)
  return result.toString()
}
fun main(){
  val list1 = listOf(1,2,3,4,5,6,7)
  println(list1.joinToStringNullable())
  println(list1.joinToStringNullable{(it*it).toString()})
}