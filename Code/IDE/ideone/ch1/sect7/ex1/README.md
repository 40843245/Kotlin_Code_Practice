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
      	
      }while( i <= -10);
      
    }
### output
  
    0
### reason of output
Since do-while checks the condition after its block finishes execution,

the block will be execute at least once.
