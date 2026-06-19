class DatabaseConnection{
  fun quary(url: String) : String = "Result of: $url"
}
class UserRepository{
  lateinit var db: DatabaseConnection 
  
  fun findUser(id: Int): String {
    return db.quary("SELECTED * FROM users WHERE id = $id")
  }
}
fun main(){
  val repo  = UserRepository()
  repo.db = DatabaseConnection()
  
  println(repo.findUser(34))
}