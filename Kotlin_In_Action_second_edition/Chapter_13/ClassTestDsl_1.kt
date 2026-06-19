class Task(val name : String , val propertys: String){
  override fun toString() = "[$propertys] $name"
}

class Column(val title : String){
  private val tasks = mutableListOf<Task>()
  
  fun task(name : String , priorty : String = " normal"){
    tasks.add(Task(name,priorty))
  }
  
  override fun toString()  = buildString{
    appendLine(" === $title ===")
    tasks.forEach{ appendLine(it)}
  }
}

class Board(val name : String){
  private val colums  = mutableListOf<Column>()
  
  fun colum(title : String, block : Column.()  -> Unit){
    val c = Column(title)
    c.block() 
    colums.add(c)
    
    
  }
  fun printData(){
    println("=== Borad : $name ====")
    colums.forEach{ print(it)}
  }
}

fun boardTest(name : String,block: Board.() -> Unit): Board{
  val b = Board(name)
  b.block()
  return b
}

fun main(){
  
  val myBoard = boardTest("Sprint 1"){
    colum("To Do"){
      task("Desing database scheme",priorty = "High")
      task("Write unit test")
      task("Update README")
    }
    colum("In Progree"){
      task("Build loing API",priorty = "high")
      task("Fix nav bug")
    }
    colum("Done"){
      task("Setup project ...",priorty = "normal")
    }
  }
  myBoard.printData()
  
}