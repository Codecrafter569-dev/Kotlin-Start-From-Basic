fun fillWithDefault(destination : MutableList<in Int>){
  destination.add(0)
  destination.add(0)
  destination.add(0)
  
  val x : Any?  = destination.first()
  println("First element (as any?) : $x")
}
fun main(){
  val ints = mutableListOf<Int>()
  fillWithDefault(ints)
  println("Ints : $ints")
  
  val list2 = mutableListOf<Number>()
  fillWithDefault(list2)
  println("Number : $list2")
  
  val anys =  mutableListOf<Any>()
  fillWithDefault(anys)
  println("Anys : $anys")
}