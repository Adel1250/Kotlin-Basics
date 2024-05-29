fun main() {
    val names = arrayOf("adel", "ashraf", "mohamed")
    val numbers = intArrayOf(1, 2, 3, 4)

    for (name in names) {
        val n = name.replaceFirstChar {
            it.uppercase()
        }
        println(n)
    }

    for (number in numbers) {
        println(number)
    }
}