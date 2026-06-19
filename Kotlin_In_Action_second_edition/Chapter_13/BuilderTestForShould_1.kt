interface Match<T>{
  fun test(value : T) : Result
data class Result(val passed: Boolean , val message : String)

}

infix  fun <T> T.should(matcher : Match<T>){
  val result = matcher.test(this)
  if (result.passed) {
    println(" PASS : ${result.message}")
  } else {
    println("Fail : ${result.message}")
  }
}

fun equal(expected: Any?):Match<Any?> = object : Match<Any?>{
  override fun test(value : Any?) = Match.Result(
  passed = value == expected, message = if(value == expected)
  "$value == $expected"
  
  else
    "$value  != $expected (expected $expected)"
  )
}

fun contain(substring : String): Match<String>  = object : Match<String>{
  override fun test(value : String)  = Match.Result(
  passed  = value.contains(substring),
  message = if(value.contains(substring))
    "$value  contain $substring"
  else 
  "$value  does not contain $substring"
  )
}

fun beNull(): Match<Any?> = object : Match<Any?>{
  override fun test(value : Any?)  = Match.Result(
  passed = value == null,
  message = if (value == null) {
    "value is null"
  } else {    
    "$value is not null"
  }
  )
}


fun haveSize(size : Int): Match<Collection<*>> = object : Match<Collection<*>> {
  override fun test(value : Collection<*>) = Match.Result(
  passed = value.size == size,
  message = if (value.size == size) {
    "Collection has size $size"
  } else {
    "expected size $size but was ${value.size}"
  }
  )
}

fun describle(suiteName : String , block: () -> Unit){
  println("\n === $suiteName ====")
  block()
}
fun main(){
  describle("String tests"){
    "Kotlin" should contain("ot")
        "Kotlin" should contain("xyz")   // fails
        "Hello"  should equal("Hello")
        "Hello"  should equal("World")   // f
  }
  
  describle("Null tests"){
    val x : String? = null
    val y: String? = "hello"
    
    x should beNull()
    y should beNull()
  }
  describle("Collection Tests"){
    val list = listOf(1,2,3)
    list should haveSize(3)
    list should haveSize(5)
  }
  
  describle("Number tests "){
    val n : Any? = 42
    n should equal(42)
    n should equal(99)
  }
  
}