fun pathPase(path: String){
  val directory = path.substringBeforeLast("/")
  val fullName = path.substringAfterLast("/")
  val fileName = fullName.substringBeforeLast(".")
  val extension = fullName.substringAfterLast(".")
  println(fullName)
  println("Dir: $directory , Name: $fileName , Ext: $extension")
}
fun main(){
  pathPase("/User/yole/kotlin-book/chapter.adoc")
}