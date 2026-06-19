enum class OrderStatus {
  PLACED, CONFIRMD,SHIPPED,OU_FOR_DELIVERY,DELIVERED,CANCELLED;
  
  fun next(): OrderStatus? {
    val all = entries
    val currentNext = all.indexOf(this)
    return if(this == DELIVERED || this == CANCELLED)
    null
    else all[currentNext+1]
  }
}
fun main() {
    var status : OrderStatus? = OrderStatus.PLACED
    
    while(status != null){
      println(" Statues : $status")
      status = status.next()
    }
}