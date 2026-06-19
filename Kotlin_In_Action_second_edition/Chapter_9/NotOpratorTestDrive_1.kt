data class Permission(val canRead: Boolean,val canwrite: Boolean){
  operator fun not() = Permission(!canRead,!canwrite)
  operator fun unaryMinus() = Permission(canwrite,canRead)
  
}
fun main(){
  val adminPerm = Permission(canRead = true,canwrite = true)
  val guestPerm = Permission(canRead = true,canwrite = false)
  
  println(!guestPerm)
  println(!adminPerm)
  println(-guestPerm)
}