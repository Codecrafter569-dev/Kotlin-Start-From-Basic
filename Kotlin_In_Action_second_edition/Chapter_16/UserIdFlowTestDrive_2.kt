import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds

fun userIdFlow(): Flow<Int> = flow{
  emit(101)
  delay(200.milliseconds)
  emit(102)
  delay(200.milliseconds)
  emit(103)
}
suspend  fun saveToDatabase(userid : Int){
  delay(600.milliseconds)
  println("User $userid saved to database /...")
}
fun main(){
  runBlocking{
    println("Starting user migration....")
    
    userIdFlow().collect{ userid -> println("Processing user : $userid")
    saveToDatabase(userid)
    println("Done with user : $userid")
    }
    
    println("Migration Complete.....")
  }
}