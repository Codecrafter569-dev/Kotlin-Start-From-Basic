fun main() {
    val team1 = "Thunder Hawks"
    val team2 = "Iron Wolves"
    val quarter = 4
    val timeLeft = "02 : 34"
    
    var score1 = 98
    var score2 = 95
    
    fun announce(event: String) = println(" $event")
    announce("Q$quarter | $timeLeft remaining")
    announce("$team1 : $score1  vs $team2 : $score2")
    
    score1 += 3
    
    val winner = if (score1 > score2) team1 else team2
    val margin = Math.abs(score1-score2)
    val mvpPoints = score1
        
println("""
        🏀 FINAL BUZZER!
        ════════════════════════════
        $team1   →  $score1 pts
        $team2  →  $score2 pts
        ════════════════════════════
        🏆 Winner: $winner by $margin point${if (margin == 1) "" else "s"}
        🌟 MVP Total: $mvpPoints pts scored by $team1
    """.trimIndent())  
}