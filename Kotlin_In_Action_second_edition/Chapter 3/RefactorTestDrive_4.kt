class User(val id: Int,val name: String,val address: String)
fun saveUser(user:User){
  fun validate(value: String,fieldName:String){
    
    if(value.isEmpty()){
      println("can't save user ${user.id}: empty $fieldName")
    }else{
        println("Save user :${user.id} , Name: ${user.name} , Address : ${user.address}")
    }
  }
  
  validate(user.name,"Name")
  validate(user.address,"Address")
}
fun main(){
  val v1 = User(1,"Vikash","")
  val v2 = User(2,"","Sanidih")
  
  saveUser(v1)
  saveUser(v2)
}