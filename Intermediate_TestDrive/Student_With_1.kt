class Student{
  var name = " "
  var marks = 0
}
fun main() {
    var student = Student()
    
    var result = with(student){
      name = "Vikash"
      marks = 900
      "$name scored $marks"
    }
    
    println(result)
}