fun main() {
    val names = arrayOf("Adel", "Ashraf")
    println(names.contentToString())
    println(names[0])
    println(names[1])
    if ("Adel" in names) {
        println("Found")
    }

    val arr = arrayOfNulls<String>(5)
    arr[0] = "Adel"
    arr[1] = "Ashraf"
    arr[2] = "Mohamed"
    arr[3] = "Mohamed"
    arr[4] = "Hamed"
    println(arr.contentToString())
}