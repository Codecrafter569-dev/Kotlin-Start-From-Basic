fun getUsername(name: String?) : String{
  return name ?: throw IllegalArgumentException("Name cannot be null ")
}
fun main() {
  println(getUsername("Priya"))
  println(getUsername(null))
}