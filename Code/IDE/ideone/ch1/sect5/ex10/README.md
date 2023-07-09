# ex10
## ideone
### code
    fun main(args: Array<String>) 
    {
    	var i : Int;
    	for(i in 0..10 step -1)
    	{
    		println(i);
    	}
    }
### output
Runtime error:

### reason about Runtime error
Since the loop is infinite (starting at 0, decreasing 1 after each loop runs, the loop continues iff i<=10).

    

