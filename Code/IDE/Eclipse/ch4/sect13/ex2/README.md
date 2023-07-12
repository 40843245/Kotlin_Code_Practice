# ex2
## Eclipse
### code
    import kotlinx.coroutines.*

    fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")
    
    fun main() {
        newSingleThreadContext("Ctx1").use { ctx1 ->
            newSingleThreadContext("Ctx2").use { ctx2 ->
                runBlocking(ctx1) {
                    log("Started in ctx1")
                    withContext(ctx2) {
                        log("Working in ctx2")
                    }
                    log("Back to ctx1")
                }
            }
        }    
    }
### output
    [Ctx1] Started in ctx1
    [Ctx2] Working in ctx2
    [Ctx1] Back to ctx1
## Kotlin official Docs
### code
Same as above
### output
The output in IDE in Kotlin official Docs.

    [Ctx1 @coroutine#1] Started in ctx1
    [Ctx2 @coroutine#1] Working in ctx2
    [Ctx1 @coroutine#1] Back to ctx1
    Exception in thread "main" java.security.AccessControlException: Access control exception due to security reasons in web playground: 
     access denied ("java.lang.RuntimePermission" "modifyThread")
     at java.lang.SecurityManager.checkPermission (:-1) 
### expected output in Kotlin official Docs
    [Ctx1 @coroutine#1] Started in ctx1
    [Ctx2 @coroutine#1] Working in ctx2
    [Ctx1 @coroutine#1] Back to ctx1
