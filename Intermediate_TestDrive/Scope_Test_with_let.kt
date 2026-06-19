
fun main() {
    val name: String? = "Viakash"
    
    name?.let{
      println("Length = ${it.length}")
    }
    
    val result = "AcodeTest".let{
      it.uppercase()
    }
    println(result)
    val result1 = "Bolo lo Na".let{
      it.lowercase()
    }
    println(result1)
}