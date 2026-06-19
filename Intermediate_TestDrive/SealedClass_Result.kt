sealed class Result
data object Loading : Result()
data object Done : Result()
fun main() {
    println(Loading)
    println(Done)
}