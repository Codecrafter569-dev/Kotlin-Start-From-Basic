fun main() {
    val name : String
    val isAdd = true
    
    if (isAdd) {
        name = "Vikash"
    }else{
      name = "not entered"
    }
    
    println(name)
    
    val a = 7
    val b = 10
    
    println(if(a < b) b else a)
    println(if(a > b) b else a)
    
    
    val obj = "1"
    
    when(obj){
      "1" -> println("One")
      
      "Hello" -> println("Greeting")
      
      else -> println("Unknown")
    }
    
   // val name = "Vikash"
    
    val code = when(name){
      
      "1" -> "One"
      "2" -> "two"
      "Hello" ->"Khoosbu"
      "Vikash" -> "CodeCreafter"
      
      else ->"Unknown"
    }
    
    println(code)
    
    
    
}