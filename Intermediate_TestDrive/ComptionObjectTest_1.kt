class School {
  companion object {
    val id : Double = 9038.39
    fun info(){
    
      println("This is a school")
    }
  }
}
class App {
  companion object {
    const val VERSION = "1.0"
  }
}

class User(val name: String){
  companion object {
    fun createdGuest(): User {
      return User("Guest")
    }
  }
}
class Student {
  companion object {
    var totalStudents = 0
    fun addStudent(){
      totalStudents++
    }
  }
}
class Calculater {
  companion object {
    fun square(n: Int) = n*n
  }
}
fun main() {
    println(School.info())
    println(App.VERSION)
    println(User.createdGuest().name)
    println(School.id)
    Student.addStudent()
    Student.addStudent()
    Student.addStudent()
    println(Student.totalStudents)
    println(Calculater.square(6))
}