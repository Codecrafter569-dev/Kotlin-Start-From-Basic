fun main() {
    val name: String? = "Vikash"
    name?.let{
      println("Name is not null")
      println("Length = ${it.length}")
    }
}