inline val <reified T> T.typeName : String 
     get() = T::class.simpleName ?: "AnonymousClass"
     
inline val <reified T> T.isNullable : Boolean 
  get() = null is T
fun main(){
  println(83.typeName)
  println("Hello".typeName)
  println(listOf(12,34,45,56,89,90,78,88,23).typeName)
}