import kotlin.properties.Delegates
class Student{
  var marks: Int by Delegates.vetoable(0){_,old,new ->
  val allowed = new in 0..100
  if (!allowed) {
      println("Invalid marks $new ! Keeping $old")
    //allowed
  }
  allowed
  
  }
}
fun main() {
    val s = Student()
    s.marks = 85; println("Marks: ${s.marks}")
    s.marks = -900; println("Marks : ${s.marks}")
    s.marks = 90; println("Marks :${s.marks}")
}