# ex1
## Eclipse
### code

    import kotlinx.coroutines.*

    fun main() = runBlocking{ 
        launch {
            delay(1000L) 
            println("World!")
        }
        println("Hello") 
    }

### output

    Hello
    World!
