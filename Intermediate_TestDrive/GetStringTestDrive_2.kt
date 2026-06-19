fun getStringLength(obj: Any): Int?{
  if (obj is String && obj.length >= 0) {
      return obj.length
  }
  return null
}
fun main() {
    println(getStringLength("Vikash Kumar"))
    println(getStringLength(""))
    println(getStringLength(1000))
}