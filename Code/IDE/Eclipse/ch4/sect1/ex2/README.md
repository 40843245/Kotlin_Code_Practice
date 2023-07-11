# ex2
## Eclipse
### code

    import kotlinx.coroutines.*

    fun main() = runBlocking{ 
        launch {
            delay(100L) 
            println("World!")
        }
        println("Hello") 
    }

### output

    Hello
    World!
