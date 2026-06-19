data class User(val name: String,val age: Int,val isPremium: Boolean)

fun getUserFilter(
minAge: Int,
requirePremiun: Boolean
): (User) -> Boolean {
  val ageCheck: (User) -> Boolean = {it.age >= minAge }
  if(!requirePremiun){
    return ageCheck
  }
  return { user -> ageCheck(user) && user.isPremium }
}
fun main(){
  val users = listOf(
  User("Alice",30,true),
  User("Bob",17,false),
  User("Charlie",25,false),
  User("Diana",27,true)
  )
  
  val filter = getUserFilter(minAge = 19,requirePremiun = true)
  
  println(users.filter(filter))
}