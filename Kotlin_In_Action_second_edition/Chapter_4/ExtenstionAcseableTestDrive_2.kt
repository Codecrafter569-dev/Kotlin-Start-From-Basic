internal open class TalkactiveButton{
  private fun yell() = println("Hey!")
  protected fun whisper() = println("Let's talk!!")
  
  fun giveSpeech(){
    yell()
    whisper()
  }
}
fun main(){
  val t = TalkactiveButton()
  t.giveSpeech()
}