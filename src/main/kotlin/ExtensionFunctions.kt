fun main() {
    val names = mutableListOf("Ashraf", "Adel")
    names.swap(0, 1)
    println(names)

    class Example {
        fun printFunctionType() { println("Class method") }
    }

    fun Example.printFunctionType() { println("Extension function") }

    fun Example.printFunctionType(i: Int) { println("Extension function #$i") }

    fun Any?.toString(): String {
        if (this == null) return "null"
        // After the null check, 'this' is autocast to a non-nullable type, so the toString() below
        // resolves to the member function of the Any class
        return toString()
    }

    Example().printFunctionType()

    Example().printFunctionType(1)
}

fun MutableList<String>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}