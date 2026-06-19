interface Media {
    val title: String
    fun play()
}
class Audio(override val title: String,val composer: String): Media{
  override fun play(){
    println("Playing audio: $title, composed by $composer")
  }
}
class Video(override val title: String, val playspeed: String): Media {
  override fun play(){
    println("The Video name is: $title and playspeed is : $playspeed")
  }
}
fun main() {
    val audio = Audio("Symphony No. 5","Beethoven")
    audio.play()
    
    val video = Video("How to get a Null","2.5x")
    video.play()
}