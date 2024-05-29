fun main() {
    val rectangle = Rectangle(1, 2)
    println(rectangle.perimeter)
}

open class Shape

// Inheritance
class Rectangle(height: Int, width: Int): Shape() {
    val perimeter = (height + width) * 2
}