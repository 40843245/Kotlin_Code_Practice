# ex1
## IDE in Kotlin official Docs
### code
    import kotlinx.coroutines.*
    
    fun main() = runBlocking<Unit> {
        launch(Dispatchers.Default + CoroutineName("test")) {
            println("I'm working in thread ${Thread.currentThread().name}")
        }    
    }
### output
    I'm working in thread DefaultDispatcher-worker-1 @test#2
