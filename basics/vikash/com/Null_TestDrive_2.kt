fun main() {
    var name: String = "Vikash Kumar"
    var nickName: String? = "Viki"
    println(name)
    println(nickName?.length)
    println(nickName?.uppercase())
    
    nickName = "Biru"
    println(nickName?.length)
    
    
    val displayName = nickName ?: "Anonymous"
    println(displayName)
    
    
    nickName = null
    val displayName2 = nickName ?: "Anonymous"
    println(displayName2)
    
    nickName?.let{
        println("Nick name hai: $it")
    } ?: println("Nick name null hai !")
}