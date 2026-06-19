import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

data class Author(val name: String)
data class Book(val title: String, val author: Author)

fun main() {
    // Step 1: A JSON string (what arrives from the network/file)
    val json = """{"title": "Catch-22", "author": {"name": "J. Heller"}}"""

    // Step 2: Use Jackson (a JSON library) to deserialize
    val mapper = jacksonObjectMapper()

    // Step 3: Convert JSON string → Book object using reified type
    val book: Book = mapper.readValue(json)

    // Step 4: Print result
    println(book)
    println(book.title)
    println(book.author.name)
}
