class User(val id: Int,val name: String,val address: String)
fun main(){
  val v1 = User(2,"Vikash","Sanidih")
  val v2 = User(3,"","Katrash")
  saveUse(v1)
  saveUse(v2)
}
fun saveUse(user: User){
  fun validate(user: User,value: String,fieldName: String){
  println("Save = Id: ${user.id} ,Name: ${user.name}, fieldName: ${user.address} ")
    if(value.isEmpty()){
     // throw IllegalArgumentException(
      println("Can't save user ${user.id}: Empty $fieldName")
    }
  }
  validate(user,user.name,"Name")
  validate(user,user.address,"Address")
}