class FormFieldNoMarker(val label: String) {
    fun hint(text: String) = println("  hint: $text")
}

class FormNoMarker {
    fun field(label: String, block: FormFieldNoMarker.() -> Unit) {
        val f = FormFieldNoMarker(label)
        f.block()
    }
    fun submit(text: String) = println("submit: $text")
}

fun formNoMarker(block: FormNoMarker.() -> Unit) = FormNoMarker().block()





@DslMarker
annotation class FormDls

@FormDls
class FormField(val label :String){
  fun hint(text :String) = println(" hint :$text")
}
@FormDls
class Form{
  fun field(label : String,block : FormField.()  -> Unit){
    val f = FormField(label)
    f.block()
  }
  
  fun submit(text : String) = println("submit : $text")
}

fun form(block : Form.() -> Unit)   = Form().block()
fun main(){
  println("===== Without @DslMarker ====")
  formNoMarker{
    field("User Name "){
      hint("Enter your username")
      
      submit("This shouldn't be callable here !")
    }
    submit("Regiter")
  }
  
  println()
  
  println(" ==== With @DslMarker ====")
  form{
    field("username"){
      hint("Enter your username")
    }
    
    field("Password"){
      hint("Mad 8 digits Password..")
    }
    submit("Regiter")
  }
  
}