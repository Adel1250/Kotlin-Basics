fun main() {
    println(add(1, 2))
    // Named arguments
    println(add(b = 3, a = 2))
    println(add())

    foo(bar = {
        println("Bar as a function")
    })

    foo {
        println("Kotlin is cool!")
    }

    foo(bar = {
        println("Baz Baz")
    })

    foo()

    println(twoValues())

    val (v1, v2, v3) = threeValues()
    println(v1)
    println(v2)
    println(v3)
}

//fun add(a: Int = 0, b: Int = 0): Int {
//    return a + b
//}

fun add(a: Int = 0, b: Int = 0) = a + b

fun foo(bar: () -> Unit = {}) {
    println("Bar function")
    bar()
}

fun twoValues(): Pair<String, Int> = "Adel" to 24

fun threeValues(): Triple<String, Int, Char> = Triple("Adel", 24, 'S')