@DslMarker
annotation class MenuDsl

@MenuDsl
class MenuItem(val name  : String){
  var shortcut : String = "none"
  
  fun shortcut(key : String) { shortcut = key }
  
  override fun toString() = "  -- $name  [shortcut :$shortcut]"
}

@MenuDsl

class Menu(val title : String){
  private val items  = mutableListOf<MenuItem>()
  
  fun item(name : String,block : MenuItem.()  -> Unit = {}){
    val i = MenuItem(name)
    i.block()
    items.add(i)
  }
  
  fun separator() = items.add(MenuItem("----"))
  
  override fun toString()  = buildString{
    appendLine("[$title]")
    items.forEach { appendLine(it) }
  }
}

fun menu(title : String,block : Menu.() -> Unit): Menu{
  val m = Menu(title)
  m.block()
  return m
}
fun main(){
  val filedMenu = menu("File"){
    item("New File"){
      shortcut("Ctrl + N")
    }
    item("Open"){
      shortcut("Ctrl - 0")
      
      
      this@menu.separator()
    }
    item("Save"){
      shortcut("Ctrl + E")
    }
    separator()
    item("Eixt"){
      shortcut("Alt + F4")
    }
  }
  
  println(filedMenu)
}