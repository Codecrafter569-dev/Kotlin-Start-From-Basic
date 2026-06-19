fun List<String>.longestWord(): String {
  var longest = ""
  for(word in this){
    if(word.length > longest.length){
      longest = word
    }
  }
  return longest
}
fun main() {
    val words = listOf("java","kotlin","Python","C")
    println(words.longestWord())
}