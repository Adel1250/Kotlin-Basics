import java.time.Instant

fun main() {
    var brand: String? = null
    // Null safety
    println(brand?.uppercase())

    // Perform operations for non-null objects
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }

    // If either `person` or `person.department` is null, the function is not called:
//    person?.department?.head = managersPool.getManager()

    var timestamp: Instant? = null
    val isoTimestamp = timestamp?.toString() // Returns a String? object which is `null`
    println(isoTimestamp)

    // Elvis operator
    val b: String? = null
    val l = b?.length ?: -1
    println(l)

    val nullableList = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList)

    // Force return null pointer exception
    val k = b!!.length
}