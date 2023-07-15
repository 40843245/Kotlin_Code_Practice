# ex1
## Eclipse
### code
    import  kotlin.comparisons.compareValues;
    fun main()
    {
    	println(compareValues(2,null));
    	println(compareValues(-1,null));
    	println(compareValues(null,2));
    	println(compareValues(null,null));
    }
### output
    1
    1
    -1
    0
