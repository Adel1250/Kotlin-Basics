fun main() {
    val name = "Adel"
    println(name.uppercase())
    println(name.lowercase())
    println(name.length)
    println(name[0])
    println(name.isNotBlank())

    // String templates
    val age = 24
    val msg = "$name's age is $age"
    println(msg)

    // Multiline Strings
    val email = """
        Hello %s
        How are you?
        Hope you are fine!
    """.trimIndent().format(name)
    println(email)

    // Strings equity
    val name1 = "Adel"
    val name2 = "Adel"
    val name3 = String("Adel".toCharArray())
    println(name1 === name2)
    println(name1 === name3)
}