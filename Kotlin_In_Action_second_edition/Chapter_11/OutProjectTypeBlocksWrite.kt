fun main(){
  val list: MutableList<out Number> = mutableListOf(1,2.5,4L)
  
  val first : Number = list.first()
  println("First : $first")
  println("All : $list")
  
  val regularList : MutableList<Number> = mutableListOf(1,2.4,8L)
  regularList.add(393)
  regularList.add(920.92)
  
  println("Regular : $regularList")
}