fun main() {
    val user = User("Adel")
    println(user)
}

data class User(
    val name: String? = null,
    val age: Int? = null
)