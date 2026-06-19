fun main(args:Array<String>){
  if(args.isEmpty()){
    println("No args passed Usage : Kotlin Hello with ArgKt <your Name>")
  }else{
    println("Hello,${args.joinToString(" ")}!")
  }
}