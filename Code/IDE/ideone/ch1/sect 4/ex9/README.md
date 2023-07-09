# ex9
## ideone
### code
  
    fun main(args: Array<String>) 
    {
    	val number = 10;
    	val threshold = 11;
    	var msg : String;
    	
    	msg = ( ( (number > threshold) ? "$number > $threshold") : ( (number == threshold) ? "$number == $threshold" ) : "$number < $threshold" ) ; 
        println(msg);
    }
### output
Compiler Error:

    prog.kt:7:32: error: expecting ')'
    	msg = ( ( (number > threshold) ? "$number > $threshold") : ( (number == threshold) ? "$number == $threshold" ) : "$number < $threshold" ) ; 
                                   ^
    prog.kt:7:33: error: unexpected tokens (use ';' to separate expressions on the same line)
    	msg = ( ( (number > threshold) ? "$number > $threshold") : ( (number == threshold) ? "$number == $threshold" ) : "$number < $threshold" ) ; 
                                    ^
    prog.kt:7:140: error: expecting an element
    	msg = ( ( (number > threshold) ? "$number > $threshold") : ( (number == threshold) ? "$number == $threshold" ) : "$number < $threshold" ) ; 
                                                                                                                                               ^
    prog.kt:7:13: error: type mismatch: inferred type is Boolean but String was expected
    	msg = ( ( (number > threshold) ? "$number > $threshold") : ( (number == threshold) ? "$number == $threshold" ) : "$number < $threshold" ) ; 
                ^
### reason of compiler error
No ternary operator for condition check ( ? : )

since there are if-else can be an expression.

### screenshot
![image](https://github.com/40843245/Kotlin_Code_Practice/assets/75050655/d9728c48-bc1c-4347-b6d9-ae03a5606e3a)




    

