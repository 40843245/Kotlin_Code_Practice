# ex1
## Eclipse
### code
      import kotlinx.coroutines.*
      
      fun main() = runBlocking {
          val job = launch {
              try {
                  repeat(1000) { i ->
                      println("job: I'm sleeping $i ...")
                      delay(500L)
                  }
              } finally {
                  println("job: I'm running finally")
              }
          }
          delay(1300L) // delay a bit
          println("main: I'm tired of waiting!")
          job.cancelAndJoin() // cancels the job and waits for its completion
          println("main: Now I can quit.")    
      }
### output
    job: I'm sleeping 0 ...
    job: I'm sleeping 1 ...
    job: I'm sleeping 2 ...
    main: I'm tired of waiting!
    job: I'm running finally
    main: Now I can quit.
