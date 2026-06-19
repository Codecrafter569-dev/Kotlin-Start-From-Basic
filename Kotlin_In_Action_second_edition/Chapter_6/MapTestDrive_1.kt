data class Student(val name:String,val id:Int)
fun main(){
  val list1 = listOf(1,2,3,45,6,7,8)
  val list2 = list1.map{it * it }

  println(list2)
    println(list1)
    
    val listOfStudent1 = listOf(Student("Vikash",1),Student("Asiss",2),Student("Alok",3),Student("Asok",4))
    
    val listName = listOfStudent1.map{it.name}
    println(listName)
    val listOfId = listOfStudent1.map{it.id}
    println(listOfId)
    
    val words = listOf("Java","Python","Kotlin","C++","C#","Rust")
    val wordInCap = words.map{it.uppercase() }
    
    println(words)
    println(wordInCap)
    
  
}