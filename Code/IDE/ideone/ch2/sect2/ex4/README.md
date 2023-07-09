# ex4
## ideone
### code
    open class Instance
    {
    	constructor(v : Any)
    	{
    		this.value = v;
    	}
    	public fun Print()
    	{
    		println("this.value=${this.value}.");
    	}
    }
    
    class DerivedClass : Instance
    {
    	constructor(v : Any) : super(v)
    }
    
    fun main()
    {
    	val inst1 = DerivedClass(2);
    	
    	inst1.Print();
    }
### output
Compiler Error

    prog.kt:5:8: error: unresolved reference: value
    		this.value = v;
           ^
    prog.kt:9:30: error: unresolved reference: value
    		println("this.value=${this.value}.");
