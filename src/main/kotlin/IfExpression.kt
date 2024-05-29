fun main() {
    val num1 = 10
    val num2 = 20
    val value = if (num1 < num2) {
        println(true)
        ":)"
    } else {
        println(false)
        ":("
    }
    println(value)
}