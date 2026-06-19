fun main() {
    val actions = listOf("title","year","author")
    val prefix = "https://example.com/book-info"
    
    val id = 5
    val urls = actions.map{action ->"$prefix/$id/$action"}
    println(urls)
    
    repeatN(5){
      println("Hello --> Bolo ")
    }
}

fun repeatN(n: Int, action: () -> Unit){
    for (i in 1 .. n) {
       action(); 
    }
}