# ex2
## Eclipse
### code
    import kotlinx.coroutines.*
    import kotlinx.coroutines.flow.*
    
              
    suspend fun performRequest(request: Int): String {
        delay(1000) // imitate long-running asynchronous work
        return "response $request"
    }
    
    fun main() = runBlocking<Unit> {
        (1..3).asFlow() // a flow of requests
            .map { request -> performRequest(request) }
            .collect { response -> println(response) }
    }
### output
    response 1
    response 2
    response 3
