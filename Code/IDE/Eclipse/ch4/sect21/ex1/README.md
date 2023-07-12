# ex1
## Eclipse
### code
    import kotlinx.coroutines.*
    import kotlinx.coroutines.flow.*
    
    fun main() = runBlocking<Unit> {
        // Convert an integer range to a flow
        (1..3).asFlow().collect { value -> println(value) } 
    }
### output
    1
    2
    3
