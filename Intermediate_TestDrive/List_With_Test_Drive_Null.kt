
fun main() {
    val list1: List<String?> = listOf("A",null,"B")
    val list2 : List<String>? = null
    
    println(list1.filterNotNull())
    println(list2?.size ?: 0)
    
    val names : List<String?> = listOf("Aman",null,"Riya",null,"John")
    val cleanNames = names.filterNotNull()
    for(name in names){
      println(name ?: "No Name")
    }
    println(cleanNames)
}