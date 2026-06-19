fun main() {
    var readOnlyShapes = listOf("Triangle","Square","Cube","circle")
    println("The first item in the list is :${readOnlyShapes.first()}")
    println("Hello bro".bold())
    
    val client = HttpsClient()
    
    val getResponseWithMember = client.request("GET","https://emample.com",emptyMap())
    
    val getResponseWithExtension = client.get("https://example.com")
    
    val getName = client.request("Hello","Vikash.com",emptyMap())
}
fun HttpsClient.get(url : String): HttpResponse = request("GET",url,emptyMap())
fun HttpsClient.post(url : String): HttpResponse = request("POST",url,emptyMap())


fun String.bold() : String = "<b>$this</b>"

class HttpsClient{
  fun request(method: String,url: String,headers: Map<String,String>): HttpResponse {
      println("Requesting $method to $url with headers: $headers")
      return HttpResponse("Response from $url")
  }
}

class HttpResponse(val body:String)