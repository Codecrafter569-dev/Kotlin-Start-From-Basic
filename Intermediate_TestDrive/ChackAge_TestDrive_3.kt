fun checkAge(age: Int?){
  if(age == null){
    println("Age missing")
    return
  }
  if ( age < 18) {
      println("You are not Allowed")
      return
  }
  println("Allowed")
}
fun main() {
   checkAge(89) 
   checkAge(null)
   checkAge(10)
}