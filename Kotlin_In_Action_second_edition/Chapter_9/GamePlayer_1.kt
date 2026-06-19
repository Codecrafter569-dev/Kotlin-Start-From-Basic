data class GamePlayer(
  val name: String,
  val score: Int,
  val level: Int
  ): Comparable<GamePlayer> {
    override fun compareTo(other: GamePlayer): Int = 
    compareValuesBy(this,other,{-it.score},{-it.level})
  }


fun main(){
  val players = listOf(
  GamePlayer("Vikash",980,10),
  GamePlayer("Alice",980,12),
  GamePlayer("Alok",780,11)
  )
  
  val ranked = players.sorted()
  ranked.forEachIndexed{ i, p -> 
  println("${i+1}. ${p.name} ---- ${p.score}pts (Level) ${p.level}")
  }
}