# ex2
## Eclipse
### code
    fun Print( readonlyMap : Map<Int,Int> , defaultValue : Int)
    {
    	var count : Int = readonlyMap.size;
    	
    	var index : Int ;
    	var value : Int? ;
    	
    	println("In Print:");
    	println(readonlyMap);
    	
    	println("Print each element  one-by-one.");
    	for(index in (0 .. count))
    	{
    		value = readonlyMap.getOrDefault(index, defaultValue);
    		
    		println ("$index:$value");
    	}
    }
    
    fun main()
    {
    	val defaultValue : Int = -1 ;
    	
    	var readOnlyAccountBalances = mapOf(1 to 100, 2 to 100, 3 to 100);
    	
    		
    	Print(readOnlyAccountBalances, defaultValue);
    }
### output
    In Print:
    {1=100, 2=100, 3=100}
    Print each element  one-by-one.
    0:-1
    1:100
    2:100
    3:100

