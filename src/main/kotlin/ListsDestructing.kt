fun main() {
    val names: MutableList<String> = mutableListOf(
        "Adel",
        "Ashraf",
        "Mohamed"
    )

//    val names = mutableListOf<String>(
//        "Adel",
//        "Ashraf",
//        "Mohamed"
//    )

//    val names = mutableListOf(
//        "Adel",
//        "Ashraf",
//        "Mohamed"
//    )
    val (one, _, three) = names
    println(one)
    println(three)
    names.add("Mohamed")
    println(names)
}