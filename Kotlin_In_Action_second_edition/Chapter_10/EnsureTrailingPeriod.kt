fun <T> ensureTrailingPeriod(seq: T) 
        where T : CharSequence , T : Appendable{
          if(!seq.endsWith('.')){
            seq.append('.')
          }
        }
  
fun main(){
  val sb = StringBuilder("Hello World")
  val sb2 = StringBuilder("Kotlin...")
  ensureTrailingPeriod(sb)
  println(sb)
  
  ensureTrailingPeriod(sb2)
  println(sb2)
}