# ex4
## ideone
### code
    fun processNonNullString(str: String) {
    	println("$str is NOT null.");
    }
    
    fun main() {
        val str: String? = "Hello"   
        //processNonNullString(str)       // compilation error: str can be null
        val length = str?.let { 
            println("let() called on $it")        
            processNonNullString(it)      // OK: 'it' is not null inside '?.let { }'
            it.length
        }
    }
### output
    let() called on Hello
    Hello is NOT null.

