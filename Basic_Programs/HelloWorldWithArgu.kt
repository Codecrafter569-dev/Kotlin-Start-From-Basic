fun main(args:Array<String>) {
    if (args.isEmpty()) {
        println("No args passed. ")
    }else{
      println("Hello,${args.joinToString(" ")} ,Hello")
    }
}