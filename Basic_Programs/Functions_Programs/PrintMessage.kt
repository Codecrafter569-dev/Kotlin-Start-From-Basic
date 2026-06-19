fun main() {
    hello(prefix="Log",message ="Hello ,bro how i can help you.")
    
    println(sum1(89,90))
}
fun hello(message:String,prefix:String){
    println("[$prefix] $message")
    println(go("How to do that","email"))
    println(go("Hello,bro you want to play a minecraft.","message",1))
}
fun go(message:String,type:String,num:Int = 0): String {
    return "[$num] -> [$type] :$message"
}

fun sum1(a:Int,b:Int) = a+b;
