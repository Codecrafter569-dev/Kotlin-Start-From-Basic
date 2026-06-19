data class Patient(val name: String , val weightKg: Double? = null){
  fun isHeavier(other: Patient): Boolean? {
    if(weightKg == null || other.weightKg == null) return null
    
    return weightKg > other.weightKg
  }
}
fun main(){
  val p1 = Patient("Vikash",89.9)
  val p2 = Patient("Bob",90.3)
  val p3 = Patient("Carol")
  
  val result = p1.isHeavier(p2)
  when(result){
    true  -> println("Vikash is Heavier")
    false  -> println("Bob is Heavier")
    null  -> println("Cannot determine")
  }
  
  println(p2.isHeavier(p3))
}