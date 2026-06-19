data class Customer(val name: String,val postalCode: Int)
fun main(){
  val v1 = Customer("Alok Kumar",1)
  val v2 = Customer("Vikash Kumar",2)
  val v3 = Customer("Alok Kumar",1)
  
  println(v1)
  println(v2)
  println(v3)
  println(v1.hashCode())
  println(v2.hashCode())
  println(v3.hashCode())
  println(v1.hashCode() == v2.hashCode())
  println(v1.hashCode() == v3.hashCode())
  
  val set = hashSetOf(v1)
  println(set.contains(v3))
  
  val (name,code) = v2
  println("Name:$name, Code: $code")
}