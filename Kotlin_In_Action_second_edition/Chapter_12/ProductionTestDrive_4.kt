import kotlin.reflect.full.primaryConstructor

data class Product(val id: Int, val name: String)

fun buildWithoutCache(count: Int) {
    val jsonMaps = List(count) { mapOf("id" to it, "name" to "Product\$it") }
    val constructor = Product::class.primaryConstructor!!

    for (jsonMap in jsonMaps) {
        // Every iteration: re-reads reflection metadata (SLOW in real JKid)
        val args = constructor.parameters.associateWith { param ->
            jsonMap[param.name]
        }
        val product = constructor.callBy(args)
        if (it < 3) println(product)  // print first 3
    }
}

fun main() {
    buildWithoutCache(5)
}
