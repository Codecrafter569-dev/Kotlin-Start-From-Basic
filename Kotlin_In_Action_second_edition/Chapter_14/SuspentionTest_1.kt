import kotlinx.coroutines.*
suspend fun mySuspendingFuctions(){
  delay(100)
  println("suspend function was Runed...")
}
suspend fun main(){
  mySuspendingFuctions()
}