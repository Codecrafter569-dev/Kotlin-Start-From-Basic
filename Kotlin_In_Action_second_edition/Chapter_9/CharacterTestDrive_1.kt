//operator fun CharSequence.iterator() : CharIterator
fun main(){
  for(c in "abcdefghijklmn"){
    println(c)
  }
  for(n in 1..10){
    println(n)
  }
}