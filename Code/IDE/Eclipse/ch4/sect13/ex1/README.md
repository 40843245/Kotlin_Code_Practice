# ex1
## Eclipse
### code
    import kotlinx.coroutines.*
    
    fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")
    
    fun main() = runBlocking<Unit> {
        val a = async {
            log("I'm computing a piece of the answer")
            6
        }
        val b = async {
            log("I'm computing another piece of the answer")
            7
        }
        log("The answer is ${a.await() * b.await()}")    
    }
### output
    [main] I'm computing a piece of the answer
    [main] I'm computing another piece of the answer
    [main] The answer is 42
## Kotlin official Docs
### code
Same as above
### output
The output in IDE in Kotlin official Docs.

    [main @coroutine#2] I'm computing a piece of the answer
    [main @coroutine#3] I'm computing another piece of the answer
    [main @coroutine#1] The answer is 42
