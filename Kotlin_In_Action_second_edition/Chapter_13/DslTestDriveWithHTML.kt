@DslMarker
annotation class HtmlTagMarker

@HtmlTagMarker
open class Tag(val name : String){
  private val children = mutableListOf<Tag>()
  
  protected fun <T : Tag> doInit(child : T,init : T.() -> Unit){
    child.init()
    children.add(child)
  }
  
  override fun toString()  = "<$name>${children.joinToString("")}</$name>"
}

class TABLE : Tag("table"){
  fun tr(init : TR.() -> Unit) = doInit(TR(), init)
}
class TR : Tag("tr"){
  fun td(init : TD.() -> Unit) = doInit(TD(),init)
}

class TD : Tag("td")

fun table(init : TABLE.() -> Unit) = TABLE().apply(init)
fun main(){
  val html = table {
    tr{
      td{}
      td{}
    }
    tr{
      td{}
    }
  }
  
  println("Static table :")
  println(html)
  
  println()
  
  val dynamic = table{
    val items = listOf("Kotlin","Java","Python")
    for(item in items){
      tr{
        td{}
      }
    }
  }
  
  println("dynamic table (${items()} -style:")
  println(dynamic)
  
  
}

fun items() = listOf("Kotlin","java","python")