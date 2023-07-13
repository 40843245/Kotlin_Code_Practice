# ex1
## Eclipse
### code
    fun Print( readonlyMap : Map<Int,Int>)
    {
    	var count : Int = readonlyMap.count();
    	
    	var index : Int ;
    	var value : Int ;
    	
    	println("In Print:");
    	println(readonlyMap);
    	
    	println("Print each element  one-by-one.");
    	for(index in (0 .. count))
    	{
    		value = readonlyMap.getOrDefault(index, 0 );
    		
    		println ("$index:$value");
    	}
    }
    
    fun main()
    {
    	var readOnlyAccountBalances = mapOf(1 to 100, 2 to 100, 3 to 100);
    		
    	Print(readOnlyAccountBalances);
    }
### output
    In Print:
    {1=100, 2=100, 3=100}
    Print each element  one-by-one.
    0:0
    1:100
    2:100
    3:100
