fun safeReadInt(promt: String):Int {
  while(true){
    print(promt)
    val input = readln()
    return try{
      input.toInt()
    }catch(e: NumberFormatException){
      println("'$input' valid number nhai hai ! Dobara try karo")
      continue
    }
  }
}
fun main() {
    val age = safeReadInt("Apni age daalo :")
    val salary = safeReadInt("Apni salary daalo : ")
    
    println("\n Age : $age")
    println(" Salary : $salary")
    println("Monthly saving (20%) : ${salary* 0.20} ")
}