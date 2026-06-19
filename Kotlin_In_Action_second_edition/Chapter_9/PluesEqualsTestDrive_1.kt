fun main(){
  val mutableList = mutableListOf(1,2)
  mutableList += 3
  println(mutableList)
  
  var immutableList = listOf(1,2,3)
  immutableList += 4
  immutableList += 20
  println(immutableList)
  
  val mutable = mutableListOf(1,2)
  val newList = mutable + listOf(4,5)
  
  println(mutable)
  println(newList)
}