import kotlinx.coroutines.*

suspend fun fetchUserName(): String{
  delay(100)
  return "Vikash"
}
suspend fun fetchUserAge() : Int{
  delay(100)
  return 30
}
fun main(){
  runBlocking{
    val name = fetchUserName()
    val age = fetchUserAge()
    println("The Name is : $name and age is $age")
  }
  println("The program was started ....")
}