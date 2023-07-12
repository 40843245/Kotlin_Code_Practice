# ex2
## Eclipse
### code
    import kotlinx.coroutines.*
    import kotlinx.coroutines.flow.*
    
              
    fun simple(): Flow<Int> = flow { 
        for (i in 1..3) {
            delay(100)          
            println("Emitting $i")
            emit(i)
        }
    }
    
    fun main() = runBlocking<Unit> {
        withTimeoutOrNull(250) { // Timeout after 250ms 
            simple().collect { value -> println(value) } 
        }
        println("Done")
    }
### output
    Emitting 1
    1
    Emitting 2
    2
    Done
