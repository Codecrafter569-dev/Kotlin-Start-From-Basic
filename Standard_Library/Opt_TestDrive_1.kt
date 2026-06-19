@OptIn(ExperimentalUnsignedTypes::class)
fun main() {
  val unsi : UIntArray = uintArrayOf(1u,2u,3u,4u,5u)  
  
  unsi[2] = 42u
  println("Updated array: ${unsi.joinToString()}")
}