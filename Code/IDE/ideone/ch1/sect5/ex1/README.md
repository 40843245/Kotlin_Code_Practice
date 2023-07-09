# ex1
## ideone
### code
    fun main(args: Array<String>) 
    {
	  for(var i=0;i<=10;i+=1)
	  {
		  println(i);
	    }
    }
### output
Compiler Error:
        
        prog.kt:4:11: error: expecting 'in'
        	for(var i=0;i<=10;i+=1)
                  ^
        prog.kt:4:12: error: expecting ')'
        	for(var i=0;i<=10;i+=1)
                   ^
        prog.kt:4:24: error: unexpected tokens (use ';' to separate expressions on the same line)
        	for(var i=0;i<=10;i+=1)
                               ^
        prog.kt:4:6: error: 'var' on loop parameter is not allowed
        	for(var i=0;i<=10;i+=1)
             ^
        prog.kt:4:14: error: unresolved reference: i
        	for(var i=0;i<=10;i+=1)
                     ^
        prog.kt:4:20: error: unresolved reference: i
        	for(var i=0;i<=10;i+=1)
                           ^
        prog.kt:4:21: error: unresolved reference: +=
        	for(var i=0;i<=10;i+=1)
                            ^
        prog.kt:6:11: error: unresolved reference: i
        		println(i);
                  ^




    

