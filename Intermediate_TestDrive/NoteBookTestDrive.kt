interface Readable{
  fun read()
}
interface Writable {
    fun write()
}
class NoteBook: Readable,Writable{
  override fun read(){
    println("Reading the Note.")
  }
  override fun write(){
    println("writing the notes")
  }
}
fun main() {
    val n = NoteBook()
    n.read()
    n.write()
}