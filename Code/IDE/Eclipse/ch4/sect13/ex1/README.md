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
