fun main() {
    val name = "Vikash"
    val salary = 75000.59
    val percentage = 0.856789
    
    val formatted = String.format("Name %-10s | Salary: %10.2f",name,salary)
    
    println(formatted)
    
    println(String.format("Percentage: %.2f%%",percentage*100))
    
    println(String.format("Roll No: %05d",42))
    
    println("PI = ${"%.4f".format(Math.PI)}")
    
    go()
}
fun go(){
  val myInt = 42
  val myLong = 123456789L
  val myDouble = 3.14159
  val myFloat = 2.71f
  val myBoolean = true
  val myChar = 'K'
  val myString = "kotlin"
  val myNull : String? = null
  
  println("Int: $myInt")
  println("Long: $myLong")
  println("Double : $myDouble")
  println("Float: $myFloat")
  println("Boolean : $myBoolean")
  println("Char : $myChar")
  println("String : $myString")
  println("Null : $myNull")
}