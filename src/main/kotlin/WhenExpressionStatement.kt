fun main() {
    val gender = 'M'

    when (gender) {
        'F' -> println("Female")
        'M' -> println("Male")
        else -> println("Other")
    }

    val g = when (gender) {
        'F' -> "Female"
        'M' -> "Male"
        else -> "Other"
    }

    println(g)
}