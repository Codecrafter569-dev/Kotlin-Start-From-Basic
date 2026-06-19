class Canvas {
  fun rect(x: Int,y:Int,w:Int,h:Int): Unit = println("$x, $y, $w, $h")
  fun circ(x:Int,y:Int,rad:Int): Unit = println("$x , $y , $rad")
  fun text(x:Int,y:Int,str:String): Unit = println("$x, $y , $str")
}
fun main() {
    val m = Canvas()
    m.text(10,10,"Foo")
    m.rect(20,30,100,50)
    m.circ(40,60,25)
    m.text(15,45,"Hello")
    m.rect(70,80,150,100)
    m.circ(90,120,40)
    m.text(30,70,"Bolo")
    println("With with functions")
    
    with(m) {
     text(10,10,"Foo")
    rect(20,30,100,50)
    circ(40,60,25)
    text(15,45,"Hello")
    rect(70,80,150,100)
    circ(90,120,40)
    text(30,70,"Bolo")  
    }
}