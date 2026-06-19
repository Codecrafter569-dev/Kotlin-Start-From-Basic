data class Student(val name: String,val marks: Int)
fun main(){
  val list1 = listOf(1,2,3,4,5,6,7)
  println(list1)
  println(list1.filter{it % 2 == 0 && it > 2})
  
  val list2 = listOf(Student("Vikash",400),Student("Assis",391),Student("Shahil",376),Student("Kunal",200),Student("Yeash",250))
  
  println(list2)
  println(list2.filter{it.marks > 300})
  
  val list3 = listOf(3,4,5,6,7,8,9,10)
  println(list3.filter {it > 6 })
}