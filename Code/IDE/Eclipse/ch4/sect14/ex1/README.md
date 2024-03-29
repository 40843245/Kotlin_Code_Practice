# ex1 
## Eclipse
### code
    import kotlinx.coroutines.*
    
    fun main() = runBlocking<Unit> {
        // launch a coroutine to process some kind of incoming request
        val request = launch {
            repeat(3) { i -> // launch a few children jobs
                launch  {
                    delay((i + 1) * 200L) // variable delay 200ms, 400ms, 600ms
                    println("Coroutine $i is done")
                }
            }
            println("request: I'm done and I don't explicitly join my children that are still active")
        }
        request.join() // wait for completion of the request, including all its children
        println("Now processing of the request is complete")
    }
### output
    request: I'm done and I don't explicitly join my children that are still active
    Coroutine 0 is done
    Coroutine 1 is done
    Coroutine 2 is done
    Now processing of the request is complete
