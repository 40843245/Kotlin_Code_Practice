# ex9
## Eclipse
### code
    import kotlinx.coroutines.*
    
    fun main() = runBlocking {
        val job = launch { // launch a new coroutine and keep a reference to its Job
            delay(1000L)
            println("World!")
        }
        println("Hello")
        job.join() // wait until child coroutine completes
        println("Done")     
    }
### output
    Hello
    World!
    Done
