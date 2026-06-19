val String.isPalindrom: Boolean
    get() = this == this.reversed()
val String.wordCount : Int
  get() = if(this.isBlank()) 0 else this.trim().split("\\s+".toRegex()).size
  

fun main() {
    println("madam".isPalindrom)
    println("kotlin".isPalindrom)
    println("How i Can Help you ".wordCount)
}