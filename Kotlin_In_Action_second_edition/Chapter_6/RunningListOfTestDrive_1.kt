data class Person(val name:String,val age:Int)
fun main(){
  val list1 = listOf(1,23,4,4,93,3,3,5)
  val runRedu = list1.runningReduce{acc,num -> acc+num}
  println(runRedu)
  
  val multipleRunRedu = list1.runningReduce{ acc, num -> acc* num }
  println(multipleRunRedu)
  
  val people = listOf(
    Person("Alok",12),
    Person("Amon",22),
    Person("Nataliya",88),
    Person("Vikash",33),
    Person("Nano",55)
  )
  val runFoldTest = people.runningFold(""){acc, person -> 
    acc+person.name
  }
  println(runFoldTest)
  
  val list2 = listOf(1,2,3,4,5,6,7,8,9,10)
  println(list2.runningReduce{acc,n -> acc + n})
}