data class Person(val name:String,val age:Int)
fun main(){
  val result = listOf(1,2,3,4,5,6,7,8,9)
                    .asSequence()
                    .map{
                      print("map($it)")
                      it*it
                    }
                    .filter{
                      print("filter($it)")
                      it % 2 == 0
                    }
                    .toList()
                    
   println(result)
   
   
   val result2 = listOf(2,3,4,5,6,7,9,10,11,12,13,14)
                     .asSequence()
                     .filter{
                       print("filter($it)")
                       it % 2 == 0 && it > 5
                     }
                     .map{
                       print("map($it)")
                       it*it+1
                     }
                     .toList()
  println(result2)
  
  
  go()
}

fun go(){
  val people = listOf(
  Person("Vikash",29),
  Person("Bob",31),
  Person("Charles",33),
  Person("Dan",21),
  Person("Dud",31)
  )
  
  val result3 = people.asSequence()
                    .map(Person::name)
                   .filter{
                     it.length < 4
                   }
                   .toList()
                   
    println(result3)
    
    
    val result4 = people.asSequence()
                       .filter{ it.age > 20 }
                       .map{
                         it.name
                       }
                       .toList()
                       
      println(result4)
}