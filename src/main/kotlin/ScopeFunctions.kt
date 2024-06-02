fun main() {
    val people = listOf(
        Person("Adel", "Ashraf", "EGY", 24),
        Person("Ahmed", "Ashraf", "EGY", 22),
        Person("Samy", "Ashraf", "EGY", 23),
        Person("Karim", "Ashraf", "EGY", 25)
    )

    println(people)

    val letVariable = Person("Akmal", "Ahmed", "EGY", 34).let { currentPerson ->
        "${currentPerson.firstName} ${currentPerson.age}"
    }
    println("let: $letVariable")

    val runVariable = Person("Akmal", "Ahmed", "EGY", 34).run {
        "${this.firstName} ${this.age}"
    }
    println("run: $runVariable")

    val withVariable = with(Person("Akmal", "Ahmed", "EGY", 34)) {
        "${this.firstName} ${this.age}"
    }
    println("with: $withVariable")

    val applyVariable = Person("Akmal", "Ahmed", "EGY", 34).apply {
        this.nationality = this.nationality.reversed()
    }
    println("apply: $applyVariable")

    val alsoVariable = Person("Akmal", "Ahmed", "EGY", 34).also { currentPerson ->
        currentPerson.nationality = currentPerson.nationality.reversed()
    }
    println("also: $alsoVariable")

}

data class Person(
    val firstName: String,
    val lastName: String,
    var nationality: String,
    val age: Int
)