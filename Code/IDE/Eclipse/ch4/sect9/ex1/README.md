# ex1
## Eclipse
### code
    import kotlinx.coroutines.*
    import kotlin.system.*
    
    fun main() = runBlocking<Unit> {
        val time = measureTimeMillis {
            val one = doSomethingUsefulOne()
            val two = doSomethingUsefulTwo()
            println("The answer is ${one + two}")
        }
        println("Completed in $time ms")    
    }
    
    suspend fun doSomethingUsefulOne(): Int {
        delay(1000L) // pretend we are doing something useful here
        return 13
    }
    
    suspend fun doSomethingUsefulTwo(): Int {
        delay(1000L) // pretend we are doing something useful here, too
        return 29
    }
### output
    The answer is 42
    Completed in 2033 ms
