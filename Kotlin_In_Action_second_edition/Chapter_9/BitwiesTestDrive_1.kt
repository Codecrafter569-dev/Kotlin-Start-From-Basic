fun main() {
    // Bitwise — not overloadable operators, but built-in infix functions
    println(0x0F and 0xF0)   // 0    (00001111 AND 11110000 = 00000000)
    println(0x0F or  0xF0)   // 255  (00001111 OR  11110000 = 11111111)
    println(0x1  shl 4)      // 16   (shift left 4 = multiply by 16)
    println(0xFF shr 4)      // 15   (shift right 4 = divide by 16)

    // Practical: permission flags using bitwise
    val READ    = 0b001  // 1
    val WRITE   = 0b010  // 2
    val EXECUTE = 0b100  // 4

    val userPerm = READ or WRITE  // 3
    println("Can read:    ${userPerm and READ    != 0}")  // true
    println("Can write:   ${userPerm and WRITE   != 0}")  // true
    println("Can execute: ${userPerm and EXECUTE != 0}")  // false
}
