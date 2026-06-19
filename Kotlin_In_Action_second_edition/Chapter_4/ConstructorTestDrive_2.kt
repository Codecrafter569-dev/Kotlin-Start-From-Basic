class User constructor(_nickname: String){
  val nickName: String
  init{
    nickName = _nickname
  }
}
fun main(){
  val uer1 = User("Alice")
  println(uer1.nickName)
  val b1 = User("Vikash Kumar")
  println(b1.nickName)
}