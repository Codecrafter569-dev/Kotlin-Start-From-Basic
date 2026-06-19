import kotlinx.coroutines.*
class DatabaseConnection : AutoCloseable{
  init{ println("DB Connection opened ....")}
  fun write(s : String) = println("Writing : $s")
  override fun close(){
    println("DB Connection CLOSE !!")
  }
}
fun main(){
  runBlocking{
    val dbTask = launch{
      val db = DatabaseConnection()
      
      delay(500)
      db.write("I love coroutines ---->+++<-----")
      db.close()
    }
    delay(200)
    println(" Cancelling task !!")
    dbTask.cancel()
    dbTask.join()
    println(" Task cancelled .. DB close hua kaya !!...")
  }
}