data class SiteVisit(
val path: String,
val duration: Double,
val os: OS
)
enum class OS{WINDOWS,LINUX,MAC,IOS,ANDROID }
val log = listOf(
SiteVisit("/",34.9,OS.WINDOWS),
SiteVisit("/",22.0,OS.MAC),
SiteVisit("/login",12.9,OS.WINDOWS),
SiteVisit("/signup",99.8,OS.IOS),
SiteVisit("/",16.0,OS.ANDROID)
)

fun List<SiteVisit>.averageDurstionFor(predicate:(SiteVisit) -> Boolean )  = filter(predicate).map(SiteVisit::duration).average()
fun main(){
  println(log.averageDurstionFor({it.os == OS.WINDOWS}))
  
  
  println(log.averageDurstionFor({it.os in setOf(OS.IOS,OS.ANDROID)}))
  
  
  println(log.averageDurstionFor({it.os == OS.IOS && it.path == "/signup"}))
}