open class Teacher {
  open fun role(){
    println("Teaching")
  }
}
class MathTeacher : Teacher(){
  override fun role(){
    println("Teaching Mathematics")
  }
}
fun main() {
    val t1 = MathTeacher()
    t1.role()
}