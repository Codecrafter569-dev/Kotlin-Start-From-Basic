interface EventHandler<in T> {
  fun handle(event: T)
}
open class UIEvent(val name : String)
class ClickEvent(name: String,val x :Int,val y:Int): UIEvent(name)

class KeyEvent(name: String,val key: Char): UIEvent(name)

val generalHandler = object : EventHandler<UIEvent>{
  override fun handle(event :UIEvent){
    println("Handling event : ${event.name}")
  }
}

val clickEvent = object : EventHandler<ClickEvent>{
  override fun handle(event : ClickEvent){
    println("Click at (${event.x} , ${event.y} )")
  }
}

fun proceeClick(handler : EventHandler<ClickEvent>){
  handler.handle(ClickEvent("onClick",100,200))
}
fun main(){
  proceeClick(generalHandler)
  proceeClick(clickEvent)
}