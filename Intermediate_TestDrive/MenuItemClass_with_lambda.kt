class MenuItem(val name: String)
class Menu(val name: String) {
  val items = mutableListOf<MenuItem>()
  
  fun item(name: String){
    items.add(MenuItem(name))
  }
  
}
fun menu(name: String, init:Menu.() -> Unit): Menu{
  val menu = Menu(name)
  menu.init()
  return menu
}
fun main() {
  val mainMenu = menu("Main menu"){
    item("Home")
    item("Settings")
    item("Exit")
  }
  
  println(mainMenu)
}