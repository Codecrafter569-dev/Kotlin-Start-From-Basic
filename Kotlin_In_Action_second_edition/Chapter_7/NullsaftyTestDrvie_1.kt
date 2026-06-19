fun main(){
  val name : String? = null
  val y: String  = name ?: "default"
  println(name)
  println(y)
  println(strLength(null))
  println(strLength(name))
  println(strLength(y))
  
  val name1 : String? = "vikash"
  
  println(name1?.length)
  println(name1?.uppercase())
  
  
  val nullName : String? = null
  println(nullName?.length)
}

fun strLength(s: String?) : Int = if(s != null) s.length else 0