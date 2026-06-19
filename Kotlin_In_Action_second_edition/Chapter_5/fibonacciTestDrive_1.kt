fun main(){
  val fibo = buildList {
    addAll(listOf(1,2,34,4))
    add(4)
    add(index=0,element=3)
  }
  println(fibo)
  
  val shouldAdd = true
  val fruit = buildSet {
    add("Apple")
    if(shouldAdd){
      addAll(listOf("Apple","Banana","Cherry"))
      
    }
  }
  println(fruit)
  
  
  val medals = buildMap<String,Int> {
    put("Gold",1)
    putAll(listOf("Silver" to 2, "Bronze" to 3))
  }
  println(medals)
}