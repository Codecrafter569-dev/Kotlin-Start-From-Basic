fun buildReport(
title: String,
items: List<String>,
headerFormatter: ((String) -> String)? = null,
footerFormatter: (() -> String)? = null
): String{
  return buildString{
    
    
    val header = headerFormatter?.invoke(title) ?: title
    appendLine(header)
    
    for(item in items){
      appendLine(" -$item")
    }
    
    
    val footer = footerFormatter?.invoke()
    if(footer != null) appendLine(footer)
  }.trim()
}
fun main(){
  println(buildReport("Sales",listOf("Item A","Item B")))
  
  println()
  
  println(buildReport(
   title = "Sales",
   items = listOf("Item A","Item B"),
   headerFormatter = {" ==== $it ====="},
   footerFormatter = {"---- End of Report ----"}
   
  ))
}