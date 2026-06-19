fun getStringLength(obj: Any): Int?{
  if (obj !is String ) {
      return null  
    }
    return obj.length
}
fun main() {
    println(getStringLength("Viakash Kumar"))
    println(getStringLength(40000))
}