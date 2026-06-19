fun main(){
  val i = 1
  println(i)
  val l : Long = i.toLong()
  println(l)
  
  val b : Byte = 23
  println(b)
  val result  = b + 1L
  println(result)
  
  
  val l1 = 23
  val list1 = listOf(1L,2L,3L,23L)
  
  println(l1.toLong() in list1)
  
  val d1 : Double = l1.toDouble()
  println(d1)
  val d2 : Float = l1.toFloat()
  println(d2)
  
  
  val usdDouler: Int = 100
  val exchangeRate: Double = 90.3
  
  val inrAmount: Double = usdDouler.toDouble() * exchangeRate
  
  println(inrAmount)
  
  val totalTransactions : Int = 1_000_000
  val totalValue: Long = totalTransactions.toLong() * 9999L
  
  println("Total value1 : $totalValue ")
}