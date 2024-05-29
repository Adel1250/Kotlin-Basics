fun main() {
    val names: List<String> = listOf(
        "Adel", "Ashraf"
    )
    println(names)
    println(names[0])
    println(names.contains("Adel"))
    println("Adel" in names)
    println(names.last())
    println(names.first())
    println(names.indexOf("Ashraf"))
}