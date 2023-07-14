# ex1
## Eclipse
### code
    fun Int.foo() { println(this + 1); } // this has type Int
    
    fun main(args: Array<String>)
    {
    	val inst1 : Instance = Instance();
    	val number : Int = 4;
    	
    	2.foo();
    	
    	inst1.foo();
    	
    	number.foo();
    }
    
    class Instance 
    {
        fun foo() { println(this); } // this has type Bar
        fun Int.foo() { println(this); } // this has type Int
    }
### output
    3
    Instance@3f99bd52
    5
