fun main(){
  parePathRegex("/User/yole/kotlin-book/chapter.aboc")
}
fun parePathRegex(path: String){
  val regex = """(.+)/(.+)\.(.+)""".toRegex()
  val matchResult = regex.matchEntire(path)
  
  if(matchResult != null){
    val(directory,fileName,extention) = matchResult.destructured
    println("Dir: $directory, name: $fileName , exit: $extention")
  }
}