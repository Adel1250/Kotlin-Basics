fun main() {
    val phone = SmartDevice("Nokia", 1111.0)
    val tv = SmartDevice("Samsung", 5555.0)
    val tv2 = SmartDevice("Samsung", 5555.0)
    val watch = SmartDevice()
    println("${tv.brand} ${tv.price}")
    println("${phone.brand} ${phone.price}")

    phone.turnOff()
    tv.turnOn()
    println(tv.isSwitchedOn)

    println(watch.brand)

    println(tv.toString())

    tv.turnOff()
    println(tv.toString())
    println(tv2.toString())
    println(tv == tv2)
}

class SmartDevice(
    var brand: String? = null,
    var price: Double? = null,
    var isSwitchedOn: Boolean = false
) {

    constructor(): this(null, 0.0)

    fun turnOn() {
        isSwitchedOn = true
        println("$brand is turned ON")
    }

    fun turnOff() {
        isSwitchedOn = false
        println("$brand is turned Off")
    }

    override fun toString(): String {
        return "SmartDevice(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (isSwitchedOn != other.isSwitchedOn) return false

        return true
    }

    override fun hashCode(): Int {
        var result = brand?.hashCode() ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + isSwitchedOn.hashCode()
        return result
    }


}