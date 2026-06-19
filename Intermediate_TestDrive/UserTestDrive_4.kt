data class User(val name: String?, val city: String?)

fun showProfile(user: User?){
  val u = user ?: return
  
  println("Name : ${u.name ?: "No Data"}")
  println("City : ${u.city ?: "No city"}")
}
fun main() {
    showProfile(User("Amit","Delhi"))
    showProfile(null)
}