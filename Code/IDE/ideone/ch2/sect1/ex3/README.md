# ex3
## ideone
### code
    class Instance
    (v : Any?)
    {
    	public val value : Any? ; 
    	init
    	{
    		this.value = v;
    	}
    	
    	public fun Print()
    	{
    		print("this.value:${this.value}.");
    	}
    }
    
    fun main()
    {
    	val inst1 = Instance(1);
    	val inst2 = Instance(2);
    	
    	inst1.Print();
    	println();
    	println("---------------------");
    	inst2.Print();
    	println();
    	println("---------------------");
    }
### output
    this.value:1.
    ---------------------
    this.value:2.
    ---------------------
