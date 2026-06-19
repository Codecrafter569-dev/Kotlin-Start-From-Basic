open class User(val name: String)
class SocicalUser(name: String):User(name)

fun main(){
  val b1 = SocicalUser("KotlinFan TestDrive")
  println(b1.name)
}