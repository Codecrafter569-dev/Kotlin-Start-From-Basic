fun main(){
  val immutable: int = 10;
  var mutable = 5;
  println("immutable = $immutable, mutable = $mutable")
  
  mutable = 483;
  println("mutable now = $mutable")
  val inferred = 3.14
  val explicit: Float = 3.58f
  println(inferred);
  println(explicit);
  val i:int = 10;
  val d: Double = i.toDouble();
  val l: Long = i.toLong();
  println(i);
  println(d);
  println(l);
}