import java.io.File

object CaseInsensitiveFileComparator : Comparator<File>{
  override fun compare(file1: File,file2: File): Int {
    return file1.path.compareTo(file2.path,ignoreCase = true)
  }
} 
fun main(){
  val files = listOf(
  File("/Zoo"),
  File("/apple"),
  File("/Banana"),
  File("/mango")
  )
  val sorted = files.sortedWith(CaseInsensitiveFileComparator)
  sorted.forEach{ println(it.path) }
  
  val max = files.maxWithOrNull(CaseInsensitiveFileComparator)
  println("Last alphabetically: ${max?.path}")
}