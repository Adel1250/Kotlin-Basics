fun main() {
    val add = operation(1, 2) {a: Int, b: Int -> a + b}
    val subtract = operation(2, 2) { a: Int, b: Int -> a - b }
    println(add)
    println(subtract)
}

// To improve performance and remove the overhead of multiple functions calls
inline fun operation(a: Int, b: Int, block: (Int, Int) -> Int): Int{
    return block(a, b)
}