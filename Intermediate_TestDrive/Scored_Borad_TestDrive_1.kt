import kotlin.properties.Delegates
class ScoredBoard{
  var score: Int by Delegates.observable(0){_,old, new -> 
  println("Score updataed : $old -> $new (+${new - old} points)")
  }
}
fun main() {
    val s1 = ScoredBoard()
    s1.score = 90
    s1.score = 200
    s1.score = 100
}