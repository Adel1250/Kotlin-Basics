fun main() {
    val number = intArrayOf(1, 2, 3)
    for (i in number.indices) {
        println(i)
    }
    for (i in number.indices.reversed()) {
        println(i)
    }
}