fun main() {
    val name = "Adel"
    val age = 24
    val isGraduated = true
    val attributesList = listOf(name, age, isGraduated)
    for (attribute in attributesList) {
        when (attribute) {
            is String -> {
                println("Name is $attribute")
            }

            is Int -> {
                println("Age is $attribute")
            }

            is Boolean -> {
                println("Graduation status is $attribute")
            }
        }
    }

    val str1: String? = null
//    val str1: String? = "Adel"
    if (str1 !is String) {
        println("String is null")
    } else {
        println("length of String ${str1.length}")
    }
}