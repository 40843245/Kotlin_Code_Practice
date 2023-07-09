# ex2
## ideone
### code
    open class Instance
    {
    	init
    	{
    		print("init");
    		println();
    	}
    	
    	constructor()
    	{
    		print("In Instance");
    		print(", ");
    		print("constructor()");
    		println();
    	}
    	public constructor(value1 : Any? )
    	{
    		print("In Instance");
    		print(", ");
    		print("constructor() with 1 arg.");
    		println();
    	}
    	
    	public constructor(value1 : Any? , value2 : Any)
    	{
    		print("In Instance");
    		print(", ");
    		print("constructor() with 2 arg.");
    		println();
    	}
    }
    
    class DerivedClass : Instance
    {
    	init
    	{
    		print("init");
    		println();
    	}
    	
    	constructor()
    	{
    		print("In DerivedClass");
    		print(", ");
    		print("constructor()");
    	}
    	public constructor(value1 : Any? )
    	{
    		print("In DerivedClass");
    		print(", ");
    		print("constructor() with 1 arg.");
    	}
    	
    	public constructor(value1 : Any? , value2 : Any)
    	{
    		print("In DerivedClass");
    		print(", ");
    		print("constructor() with 2 arg.");
    	}
    }
    
    fun main()
    {
    	val inst1 = DerivedClass();
    	println();
    	val inst2 = DerivedClass(1);
    	println();
    	val inst3 = DerivedClass(1,2);
    }
### output
    init
    In Instance, constructor()
    init
    In DerivedClass, constructor()
    init
    In Instance, constructor()
    init
    In DerivedClass, constructor() with 1 arg.
    init
    In Instance, constructor()
    init
    In DerivedClass, constructor() with 2 arg.
