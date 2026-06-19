import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
fun searchResults(query: String): Flow<String> = flow{
  if(query == "kotlin"){
    emit("kotlin coroutines Book")
    emit("kotlin in Action ")
  }
}
fun main():Unit = runBlocking{
  println("===== Search for 'kotlin' ======")
  searchResults("kotlin")
  .onEmpty{emit("No result found.")}
  .onStart{ println("Search started...")}
  .onCompletion{ println("Search was Done..")}
  .collect{ println("result : $it")}
  
  println("\n ==== Searching for java ====")
  searchResults("java")
  .onEmpty{ emit("No result was found")}
  .onStart{ println("Searching started..")}
  .onCompletion{ println("Searching was Done...")}
  .collect{ println("Result : $it")}
}