fun main() {
val result : String
    if (canPerfored()) {
        result = "Success"
    } else {
        result = "Can't perform operation"
    }
    println(result)
}
fun canPerfored(): Boolean{
  return true;
}