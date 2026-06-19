class Greeter(val greeting : String){
  operator fun invoke(name : String){
    println("$greeting , $name")
  }
}

class DependencyHandler{
  private val deps = mutableListOf<String>()
  
  fun implementstion(coordinate : String){
    deps.add(coordinate)
    println("Added : $coordinate")
  }
  
  fun testImplementation(coordinate : String){
    deps.add("Test : $coordinate")
    println(" Added (test) : $coordinate")
  }
  
  operator fun invoke(boby : DependencyHandler.()  -> Unit){
    boby()
  }
  
  fun showAll() = deps.forEach{ println(" --- $it")}
}


fun main(){
  val greeting = Greeter("Hello")
     greeting("Vikash")
     
     greeting("Bob")
     
     greeting("Shahil")
     
     val servus = Greeter("Servus")
     servus("Dmitry")
     
     println()
     
     
     val dimen = DependencyHandler()
     
     println("Direct : Print :")
     dimen.implementstion("org.jetbrains.kotlinx:coroutines:1.8.0")
     
     println("Block style---- :" )
     dimen{
       implementstion("org.jetbrains.kotlinx:coroutines:1.8.0")
       
       testImplementation("junit:junit:4.13")
       showAll()
     }
     
     println("All DependencyHandler")
     dimen.showAll()
}