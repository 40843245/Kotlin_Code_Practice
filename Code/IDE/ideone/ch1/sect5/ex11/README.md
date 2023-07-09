# ex11
## ideone
### code
    fun main(args: Array<String>) 
    {
    	var i : Int;
	    for(i in 10 downTo 0 step -1)
    	{
    		println(i);
    	}
    }
### output
Runtime error:

### reason about Runtime error
Since the loop is infinite (starting at 10, decreasing -1 (i.e. increasing 1) after each loop runs, the loop continues iff i>=10).

### NOTICE
NOTICE that in the following expression.
  
    10 downTo 0 step -1

It does NOT increase -1 (i.e. decrease 1) due to the functionality of keyword downTo.

For more details, see the Kotlin official Docs.

### Ref
https://kotlinlang.org/docs/ranges.html

    

