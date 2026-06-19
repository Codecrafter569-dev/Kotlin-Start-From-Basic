data class Transaction(val type: String,val amount: Double,val region:String)

val transactionList = listOf(
Transaction("CREDIT",5000.0,"NORTH"),
Transaction("DEBIT",200.0,"SOUTH"),
Transaction("CREDIT",1500.0,"SOUTH"),
Transaction("DEBIT",3000.0,"NORTH"),
Transaction("CREDIT",800.0,"NORTH")
)
fun forRegionType(region:String,type:String): (Transaction)  -> Boolean = {it.region == region && it.type == type }

fun List<Transaction>.totalFor(predicate:(Transaction) -> Boolean): Double = 
     filter(predicate).sumOf{it.amount}
fun main(){
val northCredits = forRegionType("NORTH","CREDIT")
val southDebits = forRegionType("SOUTH","DEBIT")
  println("North CREDIT total : ${transactionList.totalFor(northCredits)}")
  
  println("South DEBIT total: ${transactionList.totalFor(southDebits)}")
}