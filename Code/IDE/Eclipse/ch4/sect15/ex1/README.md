# ex1
## Eclipse
### code
    import kotlinx.coroutines.*
    
    fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")
    
    fun main() = runBlocking(CoroutineName("main")) {
        log("Started main coroutine")
        // run two background value computations
        val v1 = async(CoroutineName("v1coroutine")) {
            delay(500)
            log("Computing v1")
            252
        }
        val v2 = async(CoroutineName("v2coroutine")) {
            delay(1000)
            log("Computing v2")
            6
        }
        log("The answer for v1 / v2 = ${v1.await() / v2.await()}")    
    }
### output
    [main] Started main coroutine
    [main] Computing v1
    [main] Computing v2
    [main] The answer for v1 / v2 = 42
## IDE in Kotlin official Docs
### code
Same as above
### output
    [main @main#1] Started main coroutine
    [main @v1coroutine#2] Computing v1
    [main @v2coroutine#3] Computing v2
    [main @main#1] The answer for v1 / v2 = 42

### expected output
The output it produces with -Dkotlinx.coroutines.debug JVM option is similar to:

    [main @main#1] Started main coroutine
    [main @v1coroutine#2] Computing v1
    [main @v2coroutine#3] Computing v2
    [main @main#1] The answer for v1 / v2 = 42
