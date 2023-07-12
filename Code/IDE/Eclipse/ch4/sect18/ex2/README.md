# ex2
## Eclipse
### code
    import kotlinx.coroutines.*                 
                               
    suspend fun simple(): List<Int> {
        delay(1000) // pretend we are doing something asynchronous here
        return listOf(1, 2, 3)
    }
    
    fun main() = runBlocking<Unit> {
        simple().forEach { value -> println(value) } 
    }
### output
    1
    2
    3
