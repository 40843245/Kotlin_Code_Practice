# ex1
## ideone
### code
    fun main(args: Array<String>) 
    {
      var i : Int ;
      i = 0;
    
    do 
    {
    	println(i);
    	i -=1 ;
    	break;
    	
    }while( i >= -10);
    
    }
### output
    0
### reason of output
Since the keyword break will force it jump out of the do-while block, it will be executed once.
