class User(val id: Int,val name: String,val address: String)

fun saveUser(user: User){
  if(user.name.isEmpty()){
    throw IllegalArgumentException("Can't save user${user.id}: empty Name")
  }
  
  if(user.address.isEmpty()){
    throw IllegalArgumentException("Can't save address ${user.id}")
  }
}
fun main(){
  val v1 : User = User(2,"Vikash","Katrash")
  val v2 : User = User(3,"Aasis","Sanidih")
  saveUser(v1)
  saveUser(v2)
}