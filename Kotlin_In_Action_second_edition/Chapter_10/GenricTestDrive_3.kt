val <T> List<T>.penultimate: T
    get() = this[size - 2]
val <T> List<T>.lastElements: T 
       get() = this[size-1]
fun main() {
    println(listOf(1, 2, 3, 4).penultimate)   // 3  (T = Int)
    println(listOf("a", "b", "c").penultimate) // b  (T = String)
    
    println(listOf("Vikash","Alok","Anshu","Tum","Ham","Ruhul","Nandni").lastElements)
}
