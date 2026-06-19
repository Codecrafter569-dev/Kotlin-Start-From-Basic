data class User(var name:String,var age:Int)
fun main() {
   val user = User("Aman",30) 
   user.let{
     println(it.name)
   }
   user.apply{
     age = 25
   }
   user.run{
     println(age)
   }
   user.also{
     println("User updated")
   }
   with(user){
     println(name)
   }
}