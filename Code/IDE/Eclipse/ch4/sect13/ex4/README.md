# ex4
## Eclipse
### code
    import kotlinx.coroutines.*
    
    fun main() = runBlocking<Unit> {
        // launch a coroutine to process some kind of incoming request
        val request = launch {
            // it spawns two other jobs
            launch(Job()) { 
                println("job1: I run in my own Job and execute independently!")
                delay(1000)
                println("job1: I am not affected by cancellation of the request")
            }
            // and the other inherits the parent context
            launch {
                delay(100)
                println("job2: I am a child of the request coroutine")
                delay(1000)
                println("job2: I will not execute this line if my parent request is cancelled")
            }
        }
        delay(500)
        request.cancel() // cancel processing of the request
        println("main: Who has survived request cancellation?")
        delay(1000) // delay the main thread for a second to see what happens
    }
### output
    job1: I run in my own Job and execute independently!
    job2: I am a child of the request coroutine
    main: Who has survived request cancellation?
    job1: I am not affected by cancellation of the request
## IDE in Kotlin officialm Docs
### code
Same as above.
### output
    job1: I run in my own Job and execute independently!
    job2: I am a child of the request coroutine
    main: Who has survived request cancellation?
    job1: I am not affected by cancellation of the request
job1: I am not affected by cancellation of the request
