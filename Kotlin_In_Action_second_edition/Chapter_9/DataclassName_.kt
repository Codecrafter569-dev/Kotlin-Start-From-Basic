data class NameComponents(
val name: String,
val extenstion : String
)
fun splitFileName(fullname:String): NameComponents{
  val(name,extenstion) = fullname.split('.',limit = 2)
  return NameComponents(name,extenstion)
}
fun main(){
  val p = splitFileName("Hello.kt")
  val(name,extenstion) = p
  println(name)
  println(extenstion)
}