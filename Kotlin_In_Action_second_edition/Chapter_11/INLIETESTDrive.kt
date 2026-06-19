inline val <reified T> T.typeInfo: String 
get() = buildString {
  append("Value:  $this@typeInfo")
  append(" | Type : ${T::class.simpleName}")
  append(" | FQN : ${T::class.qualifiedName}")
}

fun main(){
  println(39.typeInfo)
  println("Vikash".typeInfo)
  println(listOf(1,2,3,4,4,56,7,790,93).typeInfo)
}