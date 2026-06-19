fun main() {
    print("readLine() example - kuch likhoo :")
    val input1: String? = readLine()
    println("readLine() ne diya: ${input1 ?: "Kuch nahi!(null)"}")
    
    print("readLine() example - kuch likho:")
    val input2: String = readln()
    println("readln() ne diya : $input2")
    
    val input3 = readLine() ?: "Default Value"
    println("Safe readLine(): $input3")
}