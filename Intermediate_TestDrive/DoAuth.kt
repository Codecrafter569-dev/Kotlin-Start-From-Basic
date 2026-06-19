object DoAuth {
    fun takePermas(username: String,password: String){
      println("Input Auth parameters = $username:$password")
    }
}
fun main() {
    DoAuth.takePermas("Vikash Kumar","VikaNeriC0des")
}