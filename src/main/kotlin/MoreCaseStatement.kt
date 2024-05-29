fun main() {
    val num1 = 10
    val num2 = 5
    when {
        (num1 < num2) -> {
            println(":)")
        } (num1 == num2) -> {
            println(":/")
        } else -> {
            println(":(")
        }
    }

    val age = 24

    when (age) {
        in 13 .. 18 -> {
            println("Teenager")
        } else -> {
            println("Adult")
        }
    }
}