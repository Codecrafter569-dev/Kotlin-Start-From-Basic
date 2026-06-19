import kotlin.jvm.JvmName
class CertificateManager{
  @get:JvmName("obtainsCertificate")
  @set:JvmName("putCertificate")
  var certificate : String = "------ BEGIN PRIVATE KEY ------"
}
@JvmName("performCalculation")
fun calculation(): Int {
  return (2+2) -1
}
fun main(){
  val manager = CertificateManager()
  println(manager.certificate)
  manager.certificate = "New Value"
  println(calculation())
}