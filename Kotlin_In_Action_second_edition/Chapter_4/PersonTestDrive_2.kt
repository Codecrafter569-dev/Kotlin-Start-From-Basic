class Person(var birthYear: Int){
  var ageIn2050 : Int
      get() = 2050 - birthYear
      set(value){
        birthYear = 2050 - value
      }
}
fun main(){
  val p1 = Person(2000)
  val p2 = Person(2026)
  p2.ageIn2050 = 60
  
  println(p1.birthYear)
  println(p1.ageIn2050)
  println(p2.birthYear)
  println(p2.ageIn2050)
}