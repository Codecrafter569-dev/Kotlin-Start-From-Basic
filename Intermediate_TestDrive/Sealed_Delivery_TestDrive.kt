sealed class DeliveryStates{
  data class Pending(val sender: String): DeliveryStates()
  data class InTransit(val estimatedDeliveryData: String): DeliveryStates()
  data class Delivered(val deliveryDate: String,val recipient: String) : DeliveryStates()
  data class Canceled(val reson: String) : DeliveryStates()
}
fun printDeliveryStates(status: DeliveryStates){
  when(status){
    is DeliveryStates.Pending -> {
      println("The package is pending pickup from ${status.sender}")
    }
    is DeliveryStates.InTransit -> {
      println("The package is in transit and expected to arrive by ${status.estimatedDeliveryData}")
    }
    is DeliveryStates.Delivered ->{
      println("The package was Delivered to ${status.recipient} on ${status.deliveryDate}")
    }
    is DeliveryStates.Canceled -> {
      println("The delivery was cenceled due to : ${status.reson}")
    }
  }
}
fun main() {
    val status1 : DeliveryStates = DeliveryStates.Pending("Alice")
    val status2 : DeliveryStates = DeliveryStates.InTransit("2026-11-18")
    val status3 : DeliveryStates = DeliveryStates.Delivered("2026-11-16","Vikash")
    val status4 : DeliveryStates = DeliveryStates.Canceled("Adrress not found")
    
    printDeliveryStates(status1)
    printDeliveryStates(status2)
    printDeliveryStates(status3)
    printDeliveryStates(status4)
}