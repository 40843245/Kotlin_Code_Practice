# ex1
## ideone
### code
    fun main(args: Array<String>) 
    {
    	var i : Int ;
    	var j : Int ;
    	
    	i = 0 ;
    	j = 0;
    	
    	while(i<=2)
    	{
    		while(j<=2)
    		{
    			println("i=$i,j=$j.");
    			if(j==1)
    			{
    				break;
    			}
    			j+=1;
    		}
    		i+=1;
    	}
    }
### output
    i=0,j=0.
    i=0,j=1.
    i=1,j=1.
    i=2,j=1.
### reason of output
Since the keyword break only break the current running loop (total 1 loop) by default.






    

