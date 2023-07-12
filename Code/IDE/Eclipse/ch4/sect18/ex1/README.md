# ex1
## Eclipse
### code
    fun simple(): Sequence<Int> = sequence { // sequence builder
        for (i in 1..3) {
            Thread.sleep(100) // pretend we are computing it
            yield(i) // yield next value
        }
    }
    
    fun main() {
        simple().forEach { value -> println(value) } 
    }
### output
  
    1
    2
    3
