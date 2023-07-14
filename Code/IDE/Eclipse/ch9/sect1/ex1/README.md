# ex1
## Eclipse
### code
    fun main()
    {
    	fun foo()
    	{
    	    var x = 2;
    	    
    	    fun bar(): Int
    		{
    	        return x
    	    }
    	    
    	    println(bar());
    	
    	    x = 42
    		
    	    println(bar());
    	};
    	
    	foo();
    }
### output
    2
    42
