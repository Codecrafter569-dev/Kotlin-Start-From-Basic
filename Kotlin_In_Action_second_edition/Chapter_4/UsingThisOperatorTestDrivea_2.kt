import java.net.URI
open class Downloder

class MyDownloader : Downloder {
  constructor(url: String?) : this(URI(url))
  constructor(uri: URI?): super()
  
  init{
    println("MyDownloader initialized")
  }
}
fun main(){
  MyDownloader("https://example.com")
}