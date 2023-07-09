# ex1
## ideone
### code
  
    fun main(args: Array<String>) 
    {
    	val number = 10;
    	val threshold = 11;
    	var msg : String;
    	
    	msg = if(number > threshold) "$number > $threshold"; else if(number == threshold) "$number == $threshold"; else "$number < $threshold"; ;
        println(msg);
    }
