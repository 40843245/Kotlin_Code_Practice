# ex1
## ideone
### code
    class Instance
    //(value : Any?)
    {
    	var value : Any? = null;
    
    	public constructor( v : Any?  = null)
    	{
    		this.value = v ;
    	}
    	
    	public fun Print(obj:Any)
    	{
    		print(obj);
    	}
    	public fun PrintNotNull()
    	{
    		Print("$value is NOT null.");
    	}
    	public fun PrintNull()
    	{
    		Print("$value is null.");
    	}
    	
    	public fun IsNull() : Boolean
    	{
    		var isNull : Boolean ;
    		isNull = if(this.value == null) true else false ;
    		
    		return isNull;
    	}
    }	
    
    fun main()
    {
    	val inst1 = Instance(3);
    	val inst2 = Instance();
    	
    	println("-------1nd Way--------");
    	inst1?.PrintNotNull();
    	println();
    	println("---------------");
    	inst2?.PrintNotNull();
    	println();
    	
    	println("-------2nd Way--------");
    	
    	if(inst1.IsNull() == true)
    	{
    		inst1.PrintNull();	
    	}else
    	{
    		inst1.PrintNotNull();	
    	}
    	println();
    	println("---------------");
    	
    	if(inst2.IsNull() == true)
    	{
    		inst2.PrintNull();	
    	}else
    	{
    		inst2.PrintNotNull();	
    	}
    	println();
    	println("---------------");
    	
    }
### output
    -------1nd Way--------
    3 is NOT null.
    ---------------
    null is NOT null.
    -------2nd Way--------
    3 is NOT null.
    ---------------
    null is null.
    ---------------
