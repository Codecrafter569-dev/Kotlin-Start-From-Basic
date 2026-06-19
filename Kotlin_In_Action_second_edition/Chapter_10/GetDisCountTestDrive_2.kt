fun getDiscountCalculater(tier: String): (Double) -> Double {
  val dis = when(tier.lowercase()){
    "gold" -> 0.20
    "silver" -> 0.10
    else   -> 0.0
  }
  return { price -> price*(1- dis)}
}
fun main(){
  val goldPrice = getDiscountCalculater("gold")
  val silverPrice = getDiscountCalculater("silver")
  val noDiscount = getDiscountCalculater("basic")
  
  println(goldPrice(100.0))
  println(silverPrice(200.0))
  println(noDiscount(300.0))
  
  listOf("gold","silver","basic").forEach{ iter -> val calc = getDiscountCalculater(iter)
  println("Tire -> ${calc(200.0)}")
  }
}