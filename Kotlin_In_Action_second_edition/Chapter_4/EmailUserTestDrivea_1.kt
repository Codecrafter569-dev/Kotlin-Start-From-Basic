interface EmailUser{
  val email: String
  val nickname : String
        get() = email.substringBefore('@')
}
class Person(override val email:String): EmailUser

fun main(){
  val u1 = Person("hello@kotlinlang.org")
  println(u1.nickname)
  println(u1.email)
}