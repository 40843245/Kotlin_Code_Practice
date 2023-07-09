# ex2
## ideone
### code
    fun main(args: Array<String>) 
    {
    	var i : Int ;
    	var j : Int ;
    	
    	i = 0 ;
    	j = 0;
    	
    	label1@ while(i<=2)
    	{
    		while(j<=2)
    		{
    			println("i=$i,j=$j.");
    			if(j==1)
    			{
    				break@label1; 
    			}
    			j+=1;
    		}
    		i+=1;
    	}
    }
### output
    i=0,j=0.
    i=0,j=1.

### reason of output
Since we add @label1 at end of the keyword break (without spaces), it breaks all loops in @label1 (total 2 loops).

For more details, see the Kotlin official Docs.
### NOTICE
NOTICE that 

1. It is NOT allowed to leave any letter (including space) between the keyword break and @{label}.
2. It is needed to leave one or more spaces before the control flow with repetition (such as for , while).
3. NOTE that the syntax of {label}.

### Ref
https://kotlinlang.org/docs/returns.html#return-to-labels






    

