import kotlinx.coroutines.*
class DatabaseConnection : AutoCloseable{
  init{ println("DB Connection opened !!")}
  fun write(s : String) = println(" Writing : $s")
  override fun close(){ println("DB Connection CLOSED !!!")}
  
}
class FileHandle : AutoCloseable{
  init{ println("File opened ...")}
  fun read() : String = "file content"
  override fun close(){
    println("File CLOSED!!...")
  }
}
fun main(){
  runBlocking{
    
    
    val dbTask = launch{
      val db = DatabaseConnection()
      try {
        delay(500)
        db.write("I Love coroutines...")
      }finally{
        println("Finally block was Ran ...")
        db.close()
      }
    }
    
    val fileTask = launch{
      FileHandle().use{ file -> delay(500)
      println("Read : ${file.read()}")
      }
    }
    delay(200)
    println(" Cancelling both tasks...")
    dbTask.cancel()
    fileTask.cancel()
    dbTask.join()
    fileTask.join()
    println(" Done ...")
  }
}