# ex2
## Eclipse
### code
    import kotlinx.coroutines.*
    
    fun main() = runBlocking {
        withTimeout(1300L) {
    		    repeat(10) { i ->
                println("I'm sleeping $i ...")
                delay(500L)
            }
        }
    }
### output
    I'm sleeping 0 ...
    I'm sleeping 1 ...
    I'm sleeping 2 ...
    Exception in thread "main" kotlinx.coroutines.TimeoutCancellationException: Timed out waiting for 1300 ms
    	at kotlinx.coroutines.TimeoutKt.TimeoutCancellationException(Timeout.kt:184)
    	at kotlinx.coroutines.TimeoutCoroutine.run(Timeout.kt:154)
    	at kotlinx.coroutines.EventLoopImplBase$DelayedRunnableTask.run(EventLoop.common.kt:508)
    	at kotlinx.coroutines.EventLoopImplBase.processNextEvent(EventLoop.common.kt:284)
    	at kotlinx.coroutines.DefaultExecutor.run(DefaultExecutor.kt:108)
    	at java.base/java.lang.Thread.run(Thread.java:1623)

### reason of output
The task (in runBlocking block), the timeout is 1300 milliseconds (i.e. It can wait for at most 1300 milliseconds).

While we repeat it 10 times. Each time delays 500 milliseconds, spending total 500 * 10 = 5000 milliseconds which is larger than timeout (1300 milliseconds).''

Thus, there is an exception -- kotlinx.coroutines.TimeoutCancellationException.
