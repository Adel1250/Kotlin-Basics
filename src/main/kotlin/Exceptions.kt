fun main() {
    val input = "h"
    val a: Int? = try { input.toInt() } catch (e: NumberFormatException) { throw NumberFormatException() }
    println(a)
}