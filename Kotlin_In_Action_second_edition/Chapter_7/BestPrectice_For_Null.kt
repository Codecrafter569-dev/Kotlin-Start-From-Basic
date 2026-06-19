data class Person(val name: String?)
fun safeName(person: Person): String {
  return person.name ?: "Unknown"
}
fun safeNameLength(person: Person): Int {
  return person.name?.length ?: 0
}
fun main(){
  val p1 = Person("Vikash")
  val p2 = Person(null)
  val p3 = Person("Hello")
  
  println(safeNameLength(p1))
  println(safeNameLength(p2))
  println(safeNameLength(p3))
  
  println(safeName(p1))
  println(safeName(p2))
  println(safeName(p3))
}