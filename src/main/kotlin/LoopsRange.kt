fun main() {
    println("Up to")
    for (i in 0..9) {
        print(i)
    }
    println()
    println("Down to")
    for (j in 9 downTo 0) {
        print(j)
    }
    println()
    println("Steps")
    for (k in 0 .. 10 step 2) {
        print(k)
    }
}