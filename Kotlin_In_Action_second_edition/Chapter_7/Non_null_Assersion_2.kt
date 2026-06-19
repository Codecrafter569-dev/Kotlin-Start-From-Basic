class SelectedTextList(val contents: List<String>,var selectedIndex: Int? = null)

class CopyRowAction(val list: SelectedTextList){
  fun isActionEnabled(): Boolean = list.selectedIndex != null
  
  fun executeCopyRow(){
    val index = list.selectedIndex!!
    val value = list.contents[index]
    
    println("Copying: $value")
  }
}
fun main(){
  val textList = SelectedTextList(contents = listOf("Apple","Banana","Cherry"),selectedIndex = 1)
  val action = CopyRowAction(textList)
  if(action.isActionEnabled()){
    action.executeCopyRow()
  }
}