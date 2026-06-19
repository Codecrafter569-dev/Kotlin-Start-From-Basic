class User(val name: String){
  var address: String = "unspecifield"
           set(value){
             println("""
             Address was charged for \$name:
             "\$field"  -> "\$value".
             """.trimIndent()
             )
             field = value
           }
}
fun main(){
  val user = User("Vikash")
  user.address = "Christoph-Rapparini-Bogen 23"
  println(user.address)
}