fun main() {
    var number = 10
    var long = 100L
    var double = 100.1
    // And so on....
    println("$number, $long, $double")

    lateinit var food: String

    val price1 = 10
    val price2 = 15.55
    val totalPrice: Double = price1 + price2
    println(totalPrice)

    food = "Burger"
    println(food)
}