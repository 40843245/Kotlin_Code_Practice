# ex1
## Eclipse
### code
    fun foo(vararg args: Int) { args.forEach{ print(it); print("\t"); }; println();  }
    fun intArrayOf(vararg i: Int): IntArray = i
    
    fun main()
    {
    	foo(1, 2, 3);
    	foo(*intArrayOf(1, 2, 3));
    	foo(1, 2, *intArrayOf(3, 4), 5);
    	foo(*intArrayOf(1, 2, 3), 4, *intArrayOf(5, 6));
    }
### output
    1	2	3	
    1	2	3	
    1	2	3	4	5	
    1	2	3	4	5	6	
