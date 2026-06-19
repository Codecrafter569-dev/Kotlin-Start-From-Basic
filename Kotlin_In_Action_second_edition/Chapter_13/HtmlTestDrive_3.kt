@DslMarker
annotation class MyHtml

@MyHtml
open class HtmlTag(val name : String){
  private val children  = mutableListOf<HtmlTag>()
  private var textContent = ""
  
  protected fun <T : HtmlTag> doInit(child: T,init : T.() -> Unit){
    child.init()
    children.add(child)
  }
  operator fun String.unaryPlus(){
    textContent = this
    
  }
  override fun toString(): String{
    val content = textContent+ children.joinToString("")
    return "</$name>$content</$name>"
  }
}

class UL : HtmlTag("ul"){
  fun li(init: LI.() -> Unit) = doInit(LI(),init)
}
class LI : HtmlTag("li")

class DIV : HtmlTag("div"){
  fun ul(init: UL.() -> Unit) = doInit(UL(),init)
  fun p(init : P.()  -> Unit) = doInit(P(),init)
}
class P : HtmlTag("p")
fun div(init : DIV.() -> Unit) = DIV().apply(init)
fun main(){
  val page = div{
    p{
      +"Welcome to kotlin DSLs !"
    }
    
    ul{
      val features = listOf("Type-safe","Readable","No extra library")
      
      for(f in features){
        li{+"0- $f"}
      }
   }
      p{
        +"This's it !!"
      }

    
    
  }
  
  println(page)
}