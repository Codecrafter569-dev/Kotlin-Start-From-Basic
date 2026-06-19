class Customer(val name: String,val postalCode: Int){
  override fun toString() = "Customer(name=$name, postalCode=$postalCode )"
}
fun main(){
  val p1 = Customer("Vikash Kumar",8384)
  val p2 = Customer("Assis Kumar",900)
  println(p1)
  println(p2)
}