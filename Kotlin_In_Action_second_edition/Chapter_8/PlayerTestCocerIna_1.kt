data class Player(val name : String, var health : Int)

fun applyDamage(player: Player , demage: Int){
  player.health = (player.health - demage).coerceIn(0,100)
  println("${player.name} health :${player.health}")
}
fun main(){
  val v1 = Player("Vikash",100)
  val v2 = Player("Asiss",90)
  applyDamage(v1,30)
  applyDamage(v1,120)
  applyDamage(v2,-292)
  applyDamage(v2,300)
}