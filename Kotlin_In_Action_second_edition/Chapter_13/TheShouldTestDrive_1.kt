interface Matcher<T>{
  fun test(value : T)
}
infix fun <T> T.should(matcher : Matcher<T>) = matcher.test(this)


fun startWith(prefix : String) : Matcher<String>{
  return object : Matcher<String>{
    override fun test(value : String){
      if(!value.startsWith(prefix)){
        throw AssertionError("$value does not start with $prefix")
      }else {
        println("$value start with $prefix")
      }
    }
  }
}


fun endWith(suffix : String): Matcher<String>{
  return object : Matcher<String>{
    override fun test(value : String){
      if(!value.endsWith(suffix)){
        throw AssertionError("$value does not end with $suffix")
      }else{
        println(" $value end with $suffix")
      }
    }
  }
}
fun <T : Comparable<T>>  beGraterThen(expected : T): Matcher<T>{
  return object : Matcher<T>{
    override fun test(value : T){
      // if(gorjmeme `
      if(value <= expected){
        throw AssertionError("$value is not grater then $expected")
      }else{
        println("$value is grater then $expected")
      }
    }
  }
}

fun main(){
  val s = "kotlin".uppercase()
  
  s should startWith("K")
  s should endWith("N")
  s should startWith("KO")
  println()
  val score = 90
  
  score should beGraterThen(87)
  try{
    score should beGraterThen(99)
  }catch(e : AssertionError){
    println("Test failed : ${e.message}")
  }
  
  score should beGraterThen(10)
  
  println()
  
  try {
    s should startWith("J")
  } catch (e: AssertionError) {
    println("${e.message}")
  }
  
  println()
}