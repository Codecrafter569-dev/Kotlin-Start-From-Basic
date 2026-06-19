data class Person(val name:String,val age:Int)
fun main(){
  val people = listOf(Person("Viaksh",38),Person("Alok",22),Person("Anshu",45),Person("Natalia",88))
  
  val folded = people.fold(""){acc,person -> acc+person.name}
  println(folded)
  
  
  val folded1 = people.fold(""){ acc , person -> 
     if(acc.isEmpty()) person.name else acc +", "+ person.name
     }
     println(folded1)
     
     val list1 = listOf(1,2,3,45,6,6,4,38,90)
     println(list1.fold(0){acc,n -> acc+n})
}