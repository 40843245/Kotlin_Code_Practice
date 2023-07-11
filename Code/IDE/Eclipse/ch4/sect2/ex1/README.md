# ex1
## Eclipse
### code
    import kotlinx.coroutines.*
    
    fun main() = runBlocking {
        val deferred: Deferred<Int> = async {
            loadData()
        }
        println("waiting...")
        println(deferred.await())
    }
    
    suspend fun loadData(): Int {
        println("loading...")
        delay(1000L)
        println("loaded!")
        return 42
    }
### output
    waiting...
    loading...
    loaded!
    42
