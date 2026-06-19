abstract class User(val name: String){
  abstract fun login()
}
class Admin(name: String): User(name){
  override fun login(){
    println("$name logged in as Admin.")
  }
}
fun main() {
    val r = Admin("Vikash Kumar")
    r.login()
}