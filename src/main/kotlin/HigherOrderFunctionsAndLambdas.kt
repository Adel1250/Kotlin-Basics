fun main() {
    // Passing function as a parameter (Object is treated as an object)
    val myFun1 = higherOrder(1, 2, ::addition)

    val myFun2 = higherOrder(3, 4) { a: Int, b: Int -> a + b }

    println(myFun1)
    println(myFun2)

    // Lambda
    val modOperation = { a: Int -> a % 2 == 0}

    println(modOperation(2))
}

// High order functions take functions as parameters or return them or both
// Lambda functions are those who don't have a name

fun addition(a: Int, b: Int) = a + b

fun higherOrder(a: Int, b: Int, fn: (Int, Int) -> Int): Int {
    val sum = fn(a, b)
    return sum
}