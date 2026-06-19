fun main(){
  val names = mutableListOf("Martin","Samuel","Alice")
  println(names)
  names.replaceAll{ it.uppercase() }
  println(names)
  
  val numList1 = mutableListOf(1,2,3,4,5,6,7,8,9,10)
  println(numList1)
  numList1.replaceAll{it*it+it*2}
  println(numList1)
  
  names.fill("(redacted)")
  println(names)
  
  val scores = mutableListOf(43,44,45,82,91,73)
  scores.replaceAll{if(it > 80) 80 else it }
  println(scores)
  
  val empty = emptyList<String>()
  val full = listOf("apple","orange","banana")
  
  println(empty.ifEmpty{listOf("no","values","here")})
  
  println(full.ifEmpty{listOf("no","value","here")})
  
  println(full)
  println(empty)
  
  val blankName = " "
  val emptyName = ""
  val realName = "J. Doe"
  
  println(emptyName.ifEmpty{"(unnamed)"})
  println(blankName.ifEmpty{"(unnamed)"})
  println(blankName.ifBlank{"(unnamed)"})
  println(realName.ifBlank{"(nameChange)"})
  println(emptyName.ifBlank{"(blank work)"})
  
  
  
}