data class Person(var name : String = " ", var age : Int = 0, var city : String = "Dhanbad" )
fun main(){
  val p1 = Person().apply{
    name = "Vikash"
    age = 16
    city = "Rachi"
  }
  println(p1)
  
  val description = with(p1){
    "$name is $age years old from $city"
  }
  println("P1 Details : $description")
  
  
  
  val setUpDefault : Person.() ->Unit = {
    name = "Unknown"
    age = 0
    city = "Unset"
  }
  println(setUpDefault)
  val p2 = Person().apply { setUpDefault }
  println("Stored : $p2")
  
  
  val p3 = Person()
  p3.setUpDefault()
  
  println("Direct : $p3")
  
  val mutableMap  = mutableMapOf(1 to "one")
  
  mutableMap.apply{
    this[2] = "two"
  }
  with(mutableMap){ this[3] = "three"}
  
  println("Map : $mutableMap")
}