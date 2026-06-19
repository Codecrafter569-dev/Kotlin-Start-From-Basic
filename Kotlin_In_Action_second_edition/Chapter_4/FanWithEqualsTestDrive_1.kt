enum class Color{
  RED,
  GREEN,
  BLUE,
  YELLOW,
  SKYBLUE
}
class Fan(val name: String,val color: Color, val speedRPM : Int){
  override fun equals(other: Any?): Boolean {
    if(other == null) return false
    if(other !is Fan)  return false
    return other.name == name && other.color == color && other.speedRPM == speedRPM
  }
  
  override fun toString() : String{
    return "Fan (name=$name , Color = $color , speedRPM=$speedRPM )"
  }
}
fun main(){
  val f1 = Fan("X100",Color.RED,7000)
  val f2 = Fan("HX945",Color.SKYBLUE,12000)
  val f3 = Fan("JK234",Color.YELLOW,8923)
  val f4 = Fan("X100",Color.RED,7000)
  println(f1 == f4)
  
  println(f1)
  println(f2)
  println(f3)
  println(f4)
}