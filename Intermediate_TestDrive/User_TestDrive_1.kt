open class User {
  open fun login(){
    println("User login")
  }
}
class Admin : User(){
  override fun login(){
  super.login()
    println("Admin login with extra security")
  }
}
fun main() {
    val a = Admin()
    a.login()
}