# ex8
## ideone
### code
    fun main(args: Array<String>) 
    {
    	var i : Int;
    	for(i in 0..<10)
    	{
    		println(i);
    	}
    }
### output
Compiler Error:
        
    prog.kt:4:14: error: expecting an element
      for(i in 0..<10)
                 ^
    prog.kt:4:15: error: expecting ')'
    	for(i in 0..<10)
                  ^
    prog.kt:4:17: error: unexpected tokens (use ';' to separate expressions on the same line)
    	for(i in 0..<10)
                    ^
    prog.kt:6:11: error: variable 'i' must be initialized
    		println(i);
              ^
### expected output
It should be no Compiler Error. Instead, it should print
  
    0
    1
    2
    3
    4
    5
    6
    7
    8
    9

Since in Kotlin official Docs, it says ..< is allowed.

![image](https://github.com/40843245/Kotlin_Code_Practice/assets/75050655/3b05904c-73cc-469e-a366-b6242d24a8d5)

However, in online IDE ideone, ..< is NOT recognized.


### Ref
https://kotlinlang.org/docs/ranges.html

    

