fun main(){
  val result = StringBuilder().apply sb@{
    listOf(1,3,45,66,684,9393,693).apply{
      this@sb.append(this.toString())
    }
  }
  println(result)
}