fun main(){
  val list = listOf(1,23,3,3,53,543,5)
  val summed = list.reduce{acc,element -> acc+element }
  
  println(summed)
  
  val multiplied = list.reduce { acc,element -> acc * element }
  
  println(multiplied)
  
  val nums = listOf(2,3,4)
  println(nums.reduce{acc,n -> acc+n})
}