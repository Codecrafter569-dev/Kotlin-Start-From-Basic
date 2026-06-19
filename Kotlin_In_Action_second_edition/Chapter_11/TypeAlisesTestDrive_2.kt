// Without alias — hard to read
val cache1: MutableMap<String, MutableList<Pair<Int, String>>> = mutableMapOf()

// With alias — much cleaner
typealias StudentGradeCache = MutableMap<String, MutableList<Pair<Int, String>>>

fun addGrade(
    cache: StudentGradeCache,
    student: String,
    term: Int,
    grade: String
) {
    cache.getOrPut(student) { mutableListOf() }.add(Pair(term, grade))
}

fun printGrades(cache: StudentGradeCache) {
    for ((student, grades) in cache) {
        println("$student: $grades")
    }
}

fun main() {
    val gradeBook: StudentGradeCache = mutableMapOf()

    addGrade(gradeBook, "Vikash", 1, "A")
    addGrade(gradeBook, "Vikash", 2, "A+")
    addGrade(gradeBook, "Rohan", 1, "B")

    printGrades(gradeBook)
    // Vikash: [(1, A), (2, A+)]
    // Rohan: [(1, B)]
}
