fun filterAdults(names: List<Pair<String,Int>>): List<String> {
  return names.filter{ it.second >= 18 }.map{ it.first}
}
fun main() {
    val people = listOf(
    "Vikash" to 22,
    "Rahul" to 17,
    "Priya" to 25,
    "Raj" to 15
    )
    
    val adults = filterAdults(people)
    println("Adults : $adults")
    
    val count = adults.size
    val message = when{
      count == 0 -> "Not any person is Adult!"
      count == 1  -> "Only one Adult is avalable"
      else -> "$count adults hain"
    }
    println(message)
    
    println("1 to 5:")
    (1..5).forEach{ print("$it ") }
}