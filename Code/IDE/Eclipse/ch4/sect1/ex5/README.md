# ex5
## Eclipse
### code
    // Sequentially executes doWorld followed by "Done"
    fun main() = runBlocking {
        doWorld()
        println("Done")
    }
    
    // Concurrently executes both sections
    suspend fun doWorld() = coroutineScope { // this: CoroutineScope
        launch {
            delay(2000L)
            println("World 2")
        }
        launch {
            delay(1000L)
            println("World 1")
        }
        println("Hello")
    }

### output

    Hello
    World!
