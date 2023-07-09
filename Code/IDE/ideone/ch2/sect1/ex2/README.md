# ex2
## ideone
### code
    class Instance
    {
    	init
    	{
    		print("init");
    		println();
    	}
    	
    	constructor()
    	{
    		print("constructor()");
    	}
    	public constructor(value1 : Any? )
    	{
    		print("constructor() with 1 arg.");
    	}
    	
    	public constructor(value1 : Any? , value2 : Any)
    	{
    		print("constructor() with 2 arg.");
    	}
    }
    
    fun main()
    {
    	val inst1 = Instance();
    	println();
    	val inst2 = Instance(1);
    	println();
    	val inst3 = Instance(1,2);	
    }
### output
    init
    constructor()
    init
    constructor() with 1 arg.
    init
    constructor() with 2 arg.
