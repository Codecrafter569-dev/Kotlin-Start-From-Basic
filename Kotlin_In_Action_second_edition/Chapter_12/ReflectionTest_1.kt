fun add(a:Int,b:Int) = a+b
fun substract(a:Int,b:Int) = a-b
fun multiplay(a:Int,b:Int) = a*b
fun main(){
  val operations = mapOf(
 "add" to ::add,
 "substract" to ::substract,
 "multiplay" to ::multiplay
  )
  val inputs = listOf(
  Triple("add",10,4),
  Triple("substract",10,5),
  Triple("multiplay",10,20)
  )
  
  for((opName , a,b) in inputs){
    val fn = operations[opName]
    
    if(fn != null){
      val result = fn(a,b)
      println("$opName($a,$b) = $result")
    }
  }
}