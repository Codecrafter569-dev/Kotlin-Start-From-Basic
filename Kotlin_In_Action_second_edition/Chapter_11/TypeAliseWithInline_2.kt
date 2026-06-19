typealias UserId = String
typealias ProductId = String

fun getUser(id: UserId) = println("Getting user: $id")
fun getProduct(id : ProductId) = println("Getting product id : $id")

@JvmInline value  class UserId2( val id : String)
@JvmInline value class ProductId2(val id : String)

fun getUser1(id : UserId2) = println("Getting id : ${id.id}")
fun getProduct1(id : ProductId2) = println("Getting Product id : ${id.id}")
fun main(){
  val id1 : UserId = "3ii2-Pro_jwk"
  val idp : ProductId = "product -i3i3djw192"
  
  getProduct(idp)
  getUser(id1)
  
  val uid = UserId2("user-9293n3j3")
  val puid = ProductId2("product --03idn38483")
  
  getUser1(uid)
  getProduct1(puid)
}