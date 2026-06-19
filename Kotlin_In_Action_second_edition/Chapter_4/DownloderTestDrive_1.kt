import java.net.URI

open class Downloader{
  constructor(url:String?){
    println("Downloader from URL: $url")
  }
  constructor(uri:URI?){
    println("Downloading from URI : $uri")
  }
}
class MyDownloder : Downloader {
  constructor(url : String?) : super(url){
    println("MyDownloder create a URL")
  }
  constructor(uri: URI?) : super(uri){
    println("MyDownloder create a Uri TestDrive")
  }
}
fun main(){
  println("A class can have mutiple constructor ...")
  MyDownloder("https://example.com")
  MyDownloder(URI("https://kotlinlang.org"))
}