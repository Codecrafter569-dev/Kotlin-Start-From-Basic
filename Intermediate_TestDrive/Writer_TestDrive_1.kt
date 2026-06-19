interface Writer {
    fun writer()
}
class PenWriter : Writer {
  override fun writer(){
    println("I am writing something using only pen")
  }
}
class Student(private val writer: Writer): Writer by writer
fun main() {
    val s1 = Student(PenWriter())
    s1.writer()
}