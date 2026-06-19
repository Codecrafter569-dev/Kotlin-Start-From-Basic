fun main() {
    val readOnlyJuiceMenu = mapOf("apple" to 100,"kiwi" to 150,"orange" to 100)
    
    println(readOnlyJuiceMenu)
    
    
    val juceMenu: MutableMap<String,Int> = mutableMapOf("apple" to 100,"kiwi" to 120,"orange" to 900)
    
    println(juceMenu)
    
    println("this is a value of a apple juice   :${juceMenu["apple"]}")
    
    println(juceMenu["papaya"])
    
    juceMenu["papaya"] = 20;
    juceMenu["chreey"] = 300;
    println(juceMenu)
    println(juceMenu["apple"])
    juceMenu.remove("apple")
    println(juceMenu["apple"])
    
    println(juceMenu.count())
    println(juceMenu.containsKey("kiwi"))
    println(juceMenu.containsKey("banana"))
    
    println(juceMenu.keys)
    println(juceMenu.values)
    
    
    println("orange" in juceMenu.keys)
    println("orange" in juceMenu.keys)
    println("Aloo" in juceMenu.keys)
    println(120 in juceMenu.values)
    println(130 in juceMenu.values)
}