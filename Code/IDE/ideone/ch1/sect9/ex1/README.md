# ex1
## ideone
### code
     fun main(args: Array<String>) 
      {
        var i : Int ;
        var continueCounter : Int ;
        i = 0;
        continueCounter = 0;
    
    while(i>=0) 
    {
    	println("i=$i");
       println("continueCounter=$continueCounter");
    
     continueCounter+=1;
    	if(continueCounter <= 3)
     {
       println("meet continue statement.");
        continue;
     }
     println("NOT meet continue statement.");
     	i -=1 ;
    }
    }
### output
    i=0
    continueCounter=0
    meet continue statement.
    i=0
    continueCounter=1
    meet continue statement.
    i=0
    continueCounter=2
    meet continue statement.
    i=0
    continueCounter=3
    NOT meet continue statement.
