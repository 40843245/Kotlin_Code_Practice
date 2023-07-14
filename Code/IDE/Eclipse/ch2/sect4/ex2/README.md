# ex2
## Eclipse
### code
    public class TestSubject
    {
    	public lateinit var s1: String? = null; 
    	public fun method1(message: String? = null)
    	{
    		println(message);
    	}
    }
     
    public class Instance
    {
        lateinit var subject: TestSubject;
    
        public fun setup() 
    	{
            this.subject = TestSubject();
    		this.subject.s1 = "What?"; 
        }
    
        public fun test()
    	{
            this.subject.method1(this.subject.s1);
        }
    }
    
    fun main()
    {
    	var inst1 = Instance();
    	
    	inst1.setup();
    	inst1.test();
    }
### output
Compiler Error:

      	ERROR: 'lateinit' modifier is not allowed on properties of nullable types (3, 9)
      	ERROR: 'lateinit' modifier is not allowed on properties with initializer (3, 9)

