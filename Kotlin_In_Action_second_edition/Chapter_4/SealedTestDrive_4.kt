sealed interface Toggleable{
  fun toggle()
}
class LightSwitch: Toggleable{
  override fun toggle() = println("Light")
}
class Camera: Toggleable{
  override fun toggle() = println("Camera Light")
}
fun main(){
  val items: List<Toggleable> = listOf(LightSwitch(),Camera())
  
  for(i in items){
    i.toggle()
  }
}