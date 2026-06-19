class User constructor(_nickname: String){
  val nickName = _nickname
}
class Student(_name:String){
  val name = _name
}
fun main(){
  val v1 = User("Vikash Kumar")
  println(v1.nickName)
  
  val v2 = Student("Alok Kumar")
  println(v2.name)
}