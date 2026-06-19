import java.io.File

fun File.isInsideHiddenDirectory(): Boolean =
    generateSequence(this) { it.parentFile }  // walk up parent chain
        .any { it.isHidden }

fun main() {
    val file = File("/Users/svtk/.HiddenDir/a.txt")
    println(file.isInsideHiddenDirectory())  // true
    // Walks: a.txt → .HiddenDir (hidden!) → stops
}
