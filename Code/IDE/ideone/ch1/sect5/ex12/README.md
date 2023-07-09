# ex8
## ideone
### code
    fun main(args: Array<String>) 
    {
  	for(var i:Int in rangeTo(0,10,1))
  	{
  		println(i);
  	  }
    }
### output
Compiler Error:
        
      prog.kt:4:6: error: 'var' on loop parameter is not allowed
	    for(var i:Int in rangeTo(0,10,1))
     
      prog.kt:4:19: error: unresolved reference: rangeTo
	    for(var i:Int in rangeTo(0,10,1))


    

