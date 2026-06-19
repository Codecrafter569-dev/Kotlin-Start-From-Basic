@JvmInline
value class ProductId(val id: Int)
@JvmInline
value class UserId(val id: Int)

fun getUser(id: UserId) = println("Fetching user: ${id.id}")
fun getProduct(id: ProductId) = println("Fetching product : ${id.id}")
fun main() {
    val uid = UserId(129)
    val puid = ProductId(903)
    
    getUser(uid)
    getProduct(puid)
}