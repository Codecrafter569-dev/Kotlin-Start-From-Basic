fun main() {
    val names = listOf("Hello","dinosaur","limousine","magazine","language")
    
    for (w in names) {
        if(w.startsWith('l')){
          println(w)
        }
    }
}