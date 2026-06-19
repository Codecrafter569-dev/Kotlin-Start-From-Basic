fun main() {
    println(intervalInSecond(1,20,15))
    println(intervalInSecond(2,89,90))
    println(intervalInSecond(1,9,20))
    println(intervalInSecond(9,2,34))
    println(intervalInSecond(22,12,9))
}

fun intervalInSecond(hours:Int = 0,minutes:Int = 0,second:Int = 0) = ((hours*60)+minutes)*60+second;