data class Student( var name:String,var makrs:Int)
fun main() {
    val result = Student("Rahul",80).apply{
      makrs = 90
    }
    .also{
      println("Student updated")
    }
    .run{
      "$name scored $makrs"
    }
    println(result)
}