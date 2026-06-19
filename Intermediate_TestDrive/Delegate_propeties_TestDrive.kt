class CachedStringDelegate {
  var cachedValue: String? = null
  operator fun getValue(thifRef: User,property: Any?): String{
    if (cachedValue == null) {
        cachedValue = "${thifRef.name} ${thifRef.lastName}"
        println("Computed and cached: $cachedValue")
    } else {
       println("Accessed from cached: $cachedValue") 
    }
    return cachedValue ?: "Unkown"
  }
}
class User(val name: String,val lastName: String){
  val displayName: String by CachedStringDelegate()
}
fun main() {
    val user = User("John","Kumar")
    
    println(user.displayName)
    println(user.displayName)
}