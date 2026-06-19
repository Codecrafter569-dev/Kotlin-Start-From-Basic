fun getStringLength(obj: Any): Int?{
  if (obj is String) {
        return obj.length
    }
    return null
}
fun main() {
   println(getStringLength("Vikash kumar")) 
   println(getStringLength("Aasis kumar"))
   println(getStringLength("Rahul Kumar"))
   println(getStringLength(1000))
   
}