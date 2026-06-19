class Content(val id:Int,var email: String) {
  fun fo(){
    println("Hello bro") 
    println("This is the current Id of a person :$id")
    println("This is the email of a current person:$email")
  }
}
fun main() {
    val contant = Content(1,"mary@gmail.com")
    println(contant.id)
    println(contant.email)
    contant.fo()
  //  contant.id = 9929
    contant.email = "vikashkumar@gmail.com"
    println(contant.id)
    println(contant.email)
    contant.fo()
}