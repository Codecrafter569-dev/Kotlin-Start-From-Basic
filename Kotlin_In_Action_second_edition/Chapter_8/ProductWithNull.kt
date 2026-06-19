data class Product(val name: String,val stock: Int? = null){
  fun hasMoreStockThan(other: Product): Boolean? {
    if(stock == null || other.stock == null) return null
    
    return stock > other.stock
  }
}
fun main(){
  val p1 = listOf(Product("Laptop",12),
   Product("IPhone",5),
   Product("Tablet"))
   
  val laptop = p1[0]
  val phone = p1[1]
  val tablet = p1[2]
  
  println(laptop.hasMoreStockThan(phone))
  println(phone.hasMoreStockThan(laptop))
  println(laptop.hasMoreStockThan(tablet))
  println(phone.hasMoreStockThan(tablet))
}