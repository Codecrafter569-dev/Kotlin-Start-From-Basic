class Customer(val name: String,val postCodeId: Int){
  
  override fun equals(other: Any?): Boolean{
    if(other == null || other !is Customer) return false
    return name == other.name && postCodeId == other.postCodeId
  }
  
  override fun toString(): String{
    return "Customer(name=$name , postCodeId = $postCodeId"
  }
  override fun hashCode() : Int = name.hashCode() *31+postCodeId
}
fun main(){
  val alice1 = Customer("Vikash",12)
  val alice2 = Customer("Vikash",12)
  val alice3 = Customer("Nafisa",16)
  println(alice1.hashCode() == alice2.hashCode())
  println(alice1.hashCode() == alice3.hashCode())
  println(alice1 == alice2)
  val s1 = hashSetOf(alice1)
  println(s1.contains(alice2))
  
  val map = hashMapOf(alice1 to "VIP" , alice3 to "Regular")
  println(map)
}