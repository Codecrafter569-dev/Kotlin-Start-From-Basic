data class Product(val id:String,val name: String,val price: Double)
fun main(){
  val p1 = Product("SKU0001","Laptop",999.0)
  val p2 = Product("SKU0001","Laptop",999.0)
  val p3 = Product("SKU002","Phone",699.9)
  
  println(p1 == p1)
  println(p1 == p2)
  println(p1 == p3)
  println(p1 === p2)
  println(p1 === p1)
  println(p1 === p2)
  
  val productSet = setOf(p1,p2,p3)
  
  println(productSet.size)
}