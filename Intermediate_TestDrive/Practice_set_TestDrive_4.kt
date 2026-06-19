import kotlin.properties.Delegates.observable

class Buget(val totalBuget:Int){
  var remainingBudget: Int by observable(totalBuget){_,oldValue,newValue -> 
  if (newValue < totalBuget * 0.2) {
      println("Werning: your remaining Budget ($newValue) is below 20% of your total buget.")
  } else if(newValue > oldValue){
      println("Good news: your remaining buget increased to $newValue")
  }
  }
}
fun main() {
    val myBuget = Buget(totalBuget = 1000)
    myBuget.remainingBudget = 800
    myBuget.remainingBudget = 150
    myBuget.remainingBudget = 15
    myBuget.remainingBudget = 1200
}