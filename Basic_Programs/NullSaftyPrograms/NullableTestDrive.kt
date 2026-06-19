fun main() {
    var neverNull: String = "This can't be null"
   //this will throw a  compiler  error
  //  neverNull = null
  
  var nullable: String? = "You can keep a null here"
  //this is ok because we are using nullable type mean: "?"
  nullable = null
  var inferredNotnull = "The compiler assumes non-nullable"
  // throw a complier error
//  inferredNotnull = null
fun strLength(notNull: String): Int {
    return notNull.length
}
println(neverNull)
println(inferredNotnull)
println(nullable)
  println(strLength(neverNull))
}