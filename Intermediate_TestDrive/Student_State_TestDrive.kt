class Student(val name: String){
  fun study(){
    println("$name is studying")
  }
}

fun main() {
    val name = Student("Viaksh Kumar")
    name.study()
}