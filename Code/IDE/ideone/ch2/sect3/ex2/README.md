# ex2 
## ideone
### code
    class Instance
    {
    	var value : Any?;
    	constructor(v : Any?)
    	{
    		this.value = v;
    	}
    	public var v get() = this.value;
        set(value) 
        {
            this.value = value;
        }
    }
    
    fun main()
    {
    	var inst1 = Instance(1);
    	println( inst1.v );
    	inst1.v = 2 ;
    	println( inst1.v );
    }
### output
    1
    2
