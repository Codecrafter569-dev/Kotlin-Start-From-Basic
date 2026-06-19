data class Person(val name: String,val age:Int)
fun main(){
  val numbers = (1..10).toList()
  
  val eagers = numbers
  .map{it *2 }
  .filter{it > 10 }
  
  println(eagers)
  
  val fastList = numbers
  .asSequence()
  .map{it*2 }
  .filter { it > 10 }
  .toList()
  println(fastList)
  
  
  val people = listOf(Person("Vikash",20),Person("Alok",25),Person("Nadniya",31),Person("Dave",29))
  
  val result1 = people.asSequence()
                      .filter{it.age < 30 }
                      .map{ it.name }
                      .filter{it.startsWith("A") }
                      .toList()
                      
   println(result1)     
   
   val firstFiveEvens = generateSequence(1) { it+1}
                       .filter{it % 2 == 0}
                       .take(10)
                       .toList()
                       
    println(firstFiveEvens)
    
    
    val people1 = listOf(
        Person("Alice", 26),
        Person("Bob", 29),
        Person("Anna", 31)
    )
    
    val result2 = people1
               .asSequence()
               .map(Person::name)
               .filter{it.startsWith("A") }
               .toList()
       println(result2)        
  
}