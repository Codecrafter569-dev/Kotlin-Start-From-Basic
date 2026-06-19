fun main() {
    val list = listOf(10,20,30,40,50)
    val map = mapOf("a" to 1,"b" to 2,"c" to 3)
    val set = setOf("X","Y","Z")
    
    println("List : $list")
    println("Map : $map")
    println("Set : $set")
    
    println("Tab: \t Tabbed text")
    println("NewLine: \nNew Line")
    println("QutesLine: \n Qutes is used to do somthing.")
    println("Backslash : \\")
    println("Doollar sing: \$notAVariable")
    
    println("""This has a "quote" and a \backlash\ and ${"Doollar"} sing""")
    
    val name = "Vikash Kumar"
    val age = 20
    val score = 40
   // val report = 
    
        val report = """
        ╔══════════════════════════╗
        ║    STUDENT REPORT CARD   ║
        ╠══════════════════════════╣
        ║ Name  : $name    
        ║ Age   : $age
        ║ Score : $score/100      
        ║ Grade : ${if (score >= 90) "A+" else "B"}        
        ╚══════════════════════════╝
    """.trimIndent()  
    
    println(report)
    
    val poeam = """
    |Roses are red,
    |Kotlin is great,
    |Java the purana,
    |Ab Kotlin ke zamaana!
    """.trimMargin()
    
    println(poeam)
      
}

