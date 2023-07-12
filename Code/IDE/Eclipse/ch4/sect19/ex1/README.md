# ex1
## Eclipse
### code
    import kotlinx.coroutines.*
    import kotlinx.coroutines.flow.*
    
                  
    fun simple(): Flow<Int> = flow { // flow builder
        for (i in 1..3) {
            delay(100) // pretend we are doing something useful here
            emit(i) // emit next value
        }
    }
    
    fun main() = runBlocking<Unit> {
        // Launch a concurrent coroutine to check if the main thread is blocked
        launch {
            for (k in 1..3) {
                println("I'm not blocked $k")
                delay(100)
            }
        }
        // Collect the flow
        simple().collect { value -> println(value) } 
    }
### output
    I'm not blocked 1
    1
    I'm not blocked 2
    2
    I'm not blocked 3
    3
### NOTICE
Notice the following differences in the code with the Flow from the earlier examples

    A builder function of Flow type is called flow.
    
    Code inside a flow { ... } builder block can suspend.
    
    The simple function is no longer marked with a suspend modifier.
    
    Values are emitted from the flow using an emit function.
    
    Values are collected from the flow using a collect function.
