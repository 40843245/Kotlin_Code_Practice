# ex1
## Eclipse
### code
    class Instance
    {
    	public fun <T> Func(body: T?): T?
    	{
    		return body;
    	};
    }
    
    fun main()
    {
    	val inst1 : Instance = Instance();
    	
    	println(inst1.Func(20));
    	println(inst1.Func("Hello"));
    	println(inst1.Func(null));
    }
### output
    20
    Hello
    null
