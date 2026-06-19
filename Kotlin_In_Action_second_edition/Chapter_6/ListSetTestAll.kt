fun main(){
  val list = listOf(1,2,3,4)
  println(!list.all{it == 3})
  println(list.any{it != 3})
  
  println(!list.any{it == 5})
  println(list.none{it == 5})
  
  println(emptyList<Int>().any{it > 42})
  println(emptyList<Int>().none{it > 22})
  println(emptyList<Int>().all{it > 42})
  
  val listOdd = listOf(1,5,3)
  println(listOdd.none{it % 2 == 0})
}