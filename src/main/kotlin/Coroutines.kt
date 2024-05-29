import kotlinx.coroutines.*

fun main() = runBlocking {
    launch { task1() }
    println("Hello,")
    task2()
}

suspend fun task1() {
    delay(1000)
    println("World!")
}

suspend fun task2() = coroutineScope {
    launch {
        delay(2000)
        println("Hey you")
    }
    println()
}


