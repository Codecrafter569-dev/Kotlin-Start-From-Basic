class Secret private constructor(private val agentName: String){
  fun reval(){
    println("Agent: $agentName")
  }
  companion object{
    fun create(agentName: String):Secret{
      return Secret(agentName)
    }
  }
}
fun main(){
  val s1 = Secret.create("Bob Hello")
  s1.reval()
  
}