fun readSafely(list: List<Any>){
  for(item in list){
    println("Read : $item (${item::class.simpleName}")
  }
}

fun main(){
  val nums = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
  
  readSafely(nums)
  
  val names : List<String>  = listOf("Alice","Bob","Hello","Bro","Hwo","I","Can","Help","You")
  readSafely(names)
  
  val mutableNames: MutableList<String> = mutableListOf("Alice", "Bob")
    // val bad: MutableList<Any> = mutableNames  // ❌ Compile error — invariant!
    println("MutableList<String> cannot be used as MutableList<Any> — invariant!")
}