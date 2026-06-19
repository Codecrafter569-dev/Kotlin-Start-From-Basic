class Stock(val symbol: String){
  private var _price: Double = 0.0
  
  var price: Double 
     get() = _price
      set(value){
        require(value >= 0) { "Price can't be negative!"}
        println("symbol: ${_price} -> $value")
        _price = value
      }
}
fun main() {
    val stock = Stock("INFTY")
    stock.price = 1500.0
  //  println()
    stock.price = 2000.0
    stock.price = 9000.0
}