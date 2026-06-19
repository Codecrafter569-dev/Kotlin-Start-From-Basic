import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
fun main(): Unit = runBlocking{
  val names = flow{
    emit("Vikash")
    emit("Anmol")
    emit("Yash")
    emit("Shahile")
  }
  val upperAndLower = names.transform{ name ->
  emit(name.uppercase())
  emit(name.lowercase())
  }
  print("Output :")
  upperAndLower.collect{ print("$it ,")}
}