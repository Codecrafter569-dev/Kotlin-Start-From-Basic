data class GameResult(val player : String , val score : Int? = null){
  fun beatsScore(other : GameResult) : Boolean? {
    if(score == null || other.score == null) return null
    
    return score > other.score
  }
}
fun main(){
  val p1 = GameResult("Vikash",500)
  val p2 = GameResult("Asis",200)
  val p3 = GameResult("Nafisa")
  
  println(p1.beatsScore(p2))
  println(p1.beatsScore(p3))
  println(p2.beatsScore(p1))
  println(p3.beatsScore(p2))
}