# ex12
## ideone
### code
    fun main(args: Array<String>) 
    {
	    var i : Int;
	  	for(iin rangeTo(0,10,1))
	  	{
	  		println(i);
	  	}
    }
### output
Compiler Error:
        
      prog.kt:4:12: error: expecting 'in'
  	for(iin rangeTo(0,10,1))
           ^
	prog.kt:4:19: error: expecting ')'
  	 for(iin rangeTo(0,10,1))
                  ^
	prog.kt:4:21: error: expecting ')'
  	for(iin rangeTo(0,10,1))
                    ^
	prog.kt:4:21: error: unexpected tokens (use ';' to separate expressions on the same line)
  	for(iin rangeTo(0,10,1))
                    ^
	prog.kt:6:13: error: variable 'i' must be initialized
  		println(i);

### reason of Compiler error
Due to the misuse of the keyword rangeTo.

For more details about the syntax of rangeTo, see the Kotlin official Docs.

### Ref
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/range-to.html
    

