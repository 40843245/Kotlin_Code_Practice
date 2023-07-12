# ex1
## Eclipse
### code
    import kotlinx.coroutines.*
    
    fun main() = runBlocking<Unit> {
        println("My job is ${coroutineContext[Job]}")    
    }
### output
    My job is BlockingCoroutine{Active}@6a6824be
## Kotlin in IDE in Kotlin official Docs
### code
Same as above

### output
    My job is "coroutine#1":BlockingCoroutine{Active}@52d455b8

### expected output in official Docs
In the debug mode, it outputs something like this:
      
      My job is "coroutine#1":BlockingCoroutine{Active}@6d311334

![image](https://github.com/40843245/Kotlin_Code_Practice/assets/75050655/1a8db9d8-5137-4328-8d81-8fbdbe544e36)

### NOTICE
Notice that

    isActive in CoroutineScope is just a convenient shortcut for coroutineContext[Job]?.isActive == true.

## Ref
Example code refers:

https://kotlinlang.org/docs/coroutine-context-and-dispatchers.html#children-of-a-coroutine


