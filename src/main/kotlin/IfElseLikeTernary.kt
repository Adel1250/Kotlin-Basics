fun main() {
    val num1 = 100;
    val num2 = 20
    val v = if (num1 < num2) ":)" else ":("
    println(v)
    val v1 =
        if (num1 < num2)
            ":)"
        else if (num1 == 100)
            "Hooray"
        else
            ":("
    println(v1)
}