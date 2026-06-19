class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            println("Can't save user $id: Empty $fieldName")
        }
    }
    
    validate(name, "Name")
    validate(address, "Address")
}

fun saveData(user: User) {
    user.validateBeforeSave()
}

fun main() {
    val v1 = User(1, "Vikash Kumar", "")
    val v2 = User(2, "Aasis Kumar", "Sanidiha")
    val v3 = User(3, "", "Dhanbad")

    saveData(v1)
    saveData(v2)
    saveData(v3)
}