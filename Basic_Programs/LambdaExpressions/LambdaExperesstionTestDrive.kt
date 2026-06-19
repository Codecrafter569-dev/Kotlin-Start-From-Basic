fun main() {
    val numbers = listOf(2,4,-6,8,9,0,2,3,5,458,-34,89)
    val position = numbers.filter({x -> x > 0})
    
    val isNagative = {x:Int -> x < 0}
    val negatives = numbers.filter(isNagative)
    
    println(position)
    println(negatives)
    
    val num = listOf(1,-2,3,-4,5,-6)
    val doubled = num.map({x -> x * 2})
    val isTripple = {x:Int -> x * 3}
    val tripple = num.map(isTripple)
    println(doubled)
    println(tripple)
}