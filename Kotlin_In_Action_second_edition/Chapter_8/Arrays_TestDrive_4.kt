fun main(){
  val players = arrayOf("Vikash","Alice","Bob","Carol","Deva")
  val scores = intArrayOf(980,870,920,740,859)
  val ranked = players.zip(scores.toTypedArray()).sortedByDescending{ it.second }
  
  println(" ==== LEADERBOARD =====")
  ranked.forEachIndexed{ index , (name,score) ->
  val medal = when(index){
    0  -> "First"
    1  -> "Second"
    3  -> "Thired"
    else  -> "${index+1}"
  }
  println("$medal $name  - $score")
  }
}