# ex5
## ideone
### code
  
    fun main(args: Array<String>) 
    {
    	val number = 10;
    	val threshold = 11;
    	var msg : String;
    	
    	msg = if(number > threshold)
        {
        	println("number:$number");
        	println("threshold:$threshold");
        	"$number > $threshold";
        	println("greater");
        
        }
        else if(number == threshold)
        {
        	println("number:$number");
        	println("threshold:$threshold");
        	"$number == $threshold";
        	println("equal");
        	
        }else
        {
        	println("number:$number");
        	println("threshold:$threshold");
        	"$number < $threshold";
        	println("less");
        	
        };
        
        println(msg);
    }
### output
Compiler Error:

    prog.kt:8:5: error: type mismatch: inferred type is Unit but String was expected
    {
    ^
    prog.kt:15:10: error: type mismatch: inferred type is Unit but String was expected
      else if(number == threshold)
         ^
### screenshot
![image](https://github.com/40843245/Kotlin_Code_Practice/assets/75050655/d9728c48-bc1c-4347-b6d9-ae03a5606e3a)




    

